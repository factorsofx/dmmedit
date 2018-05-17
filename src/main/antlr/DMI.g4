grammar DMI;

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

iconStates : header iconDesc + ;