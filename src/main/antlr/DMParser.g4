parser grammar DMParser;

options { tokenVocab=DMLexer; }

objectBlock : statement+ ;

statement : varDecl NL
          | path INDENT objectBlock DEDENT
          ;

varDecl : path EQUALS expr varParam? ;

varParam : KW_IN expr ;

string : STR_OPEN embed* STR_END ;
embed : EMBED_OPEN expr EMBED_CLOSE ;

expr : expr ( STRICT_DEREF | LAX_DEREF ) IDENTIFIER      # exprDeref
     | expr OPEN_PAREN  arg ( ARG_SEP arg )* CLOSE_PAREN # exprCall
     | expr OPEN_BRACKET expr CLOSE_BRACKET              # exprIndex
     | OPEN_PAREN expr CLOSE_PAREN    # exprParen
     | BOOL_NOT expr                  # exprBoolNot
     | BIT_NOT expr                   # exprBitNot
     | INCR expr                      # exprPreIncr
     | DECR expr                      # exprPreDecr
     | NEG expr                       # exprNegate
     | expr POW expr                  # exprPow
     | expr MULT expr                 # exprMult
     | expr DIV expr                  # exprDiv
     | expr MOD expr                  # exprMod
     | expr ADD expr                  # exprAdd
     | expr NEG expr                  # exprSub
     | value                          # exprValue
     ;

arg : expr ( KW_AS path ( KW_IN expr )? )? ;

value : path   # valPath
      | NUM    # valNum
      | string # valStr
      ;

path : DIV? IDENTIFIER ( DIV IDENTIFIER )* ;