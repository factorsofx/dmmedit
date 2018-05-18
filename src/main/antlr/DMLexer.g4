lexer grammar DMLexer;

tokens { INDENT, DEDENT, STR_OPEN, STR_END, EMBED_OPEN }

@lexer::header
{
import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members
{
private int embeds = 0;
private int nesting = 0;

private final DenterHelper denter = new DenterHelper(NL, INDENT, DEDENT)
{
    @Override
    public Token pullToken()
    {
        return DMLexer.super.nextToken();
    }
};

@Override
public Token nextToken()
{
    return denter.nextToken();
}
}

LINE_ESCAPE : '\\' CRLF -> skip ;
IGNORE_NL : CRLF {nesting > 0}? -> skip ;
NL : ( CRLF  [ \t]* );

DSTR_OPEN   : '{"' -> pushMode(DSTR), type(STR_OPEN) ;
SSTR_OPEN   : '"'  -> pushMode(STR) , type(STR_OPEN) ;

EMBED_CLOSE : ']' {embeds > 0}?
             { embeds--; }
             -> popMode;

// Keywords

KW_AS : 'as' ;
KW_IN : 'in' ;

// Operators

STRICT_DEREF : '.' ;
LAX_DEREF    : ':' ;
BOOL_NOT : '!' ;
BIT_NOT  : '~' ;
INCR     : '++' ;
DECR     : '--' ;
NEG      : '-' ;
POW      : '**' ;
MULT     : '*' ;
DIV      : '/' ;
MOD      : '%' ;
ADD      : '+' ;

OPEN_PAREN  : '(' { nesting++; } ;
CLOSE_PAREN : ')' { nesting--;} ;

OPEN_BRACKET  : '[' { nesting++; } ;
CLOSE_BRACKET : ']' { nesting--; } ;

ARG_SEP : ',' ;

NUM : '-' ? [0-9]+ ( '.' [0-9]+ )? ;

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9_]* ;

EQUALS      :  '=' ;
BRACE_OPEN  :  '{' ;
BRACE_CLOSE :  '}' ;

fragment CRLF : '\r' ? '\n' ;

WS : [\t ] -> skip ;

mode DSTR;

DEMBED_OPEN  : '['
              { embeds++; }
              ->
              type(EMBED_OPEN),
              pushMode(DEFAULT_MODE);

DSTR_END     : '"}' -> popMode, type(STR_END) ;
DSTR_FRAG    : . -> more ;

mode STR;

SEMBED_OPEN  : '['
              { embeds++; }
              ->
              type(EMBED_OPEN),
              pushMode(DEFAULT_MODE);

SSTR_END     : '"' -> popMode, type(STR_END) ;
SSTR_FRAG    : . -> more ;