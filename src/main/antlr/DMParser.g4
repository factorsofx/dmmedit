parser grammar DMParser;

options { tokenVocab=DMLexer; }

objectBlock : statement+ ;

statement : varDecl NL
          | path INDENT objectBlock DEDENT
          ;

varDecl : path EQUALS varVal ;

varVal : STRING # string
       | NUM    # number
       ;

path : PATH_SEPARATOR? IDENTIFIER ( PATH_SEPARATOR IDENTIFIER )* ;