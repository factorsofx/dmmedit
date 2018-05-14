grammar DMM;

map : assignSection mapSection ;

assignSection : ( keyAssign )+ ;

mapSection : ( mapAssign )+ ;

keyAssign : STR '=' '(' objDecl (',' objDecl)* ')' ;

objDecl : PATH ( '{' varAssign ( ';' varAssign )* '}' )? ;

varAssign: IDENTIFIER '=' varVal ;

varVal : STR
       | FILENAME
       | NUM
       | FUNC_CALL
       | NULL
       | PATH
       ;

mapAssign : coords '=' DOC_STR ;

coords : '(' NUM ',' NUM ',' NUM ')' ;

PATH       : PATH_FRAG + ;
PATH_FRAG  : '/' IDENTIFIER ;

STR        : '"' .*? '"' ;
FILENAME   : '\'' .*? '\'' ;
NUM        : '-'? [0-9]+ ('.' [0-9]+ )?
           | '-'? [0-9]+ 'e' [+-] [0-9]+ ;
FUNC_CALL  : IDENTIFIER '(' .*? ')' ;
NULL       : 'null' ;

DOC_STR    : '{"' .+? '"}' ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]* ;

COMMENT : '//' .+? ( '\r'? '\n' ) -> skip ;

WS : [ \t\r\n]+ -> skip;
