lexer grammar DMLexer;

tokens { INDENT, DEDENT }

@lexer::header
{
import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members
{
private final DenterHelper denter = new DenterHelper(NL, DMLexer.INDENT, DMLexer.DEDENT)
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

DSTR_OPEN  : '{"' -> mode(STR) ;
STR_OPEN   : '"'  -> mode(DSTR) ;

NUM        : '-' ? [0-9]+ ( '.' [0-9]+ )? ;

NL : ( '\r'?  '\n'  WS* ) | ';' ;

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9_]* ;
PATH_SEPARATOR : '/' ;

EQUALS      :  '=' ;
BRACE_OPEN  :  '{' ;
BRACE_CLOSE :  '}' ;

WS : [\t ] -> skip ;