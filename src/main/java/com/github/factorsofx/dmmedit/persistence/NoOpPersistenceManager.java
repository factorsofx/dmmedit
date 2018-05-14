package com.github.factorsofx.dmmedit.persistence;

public class NoOpPersistenceManager implements PersistenceManager
{
    @Override
    public int getIntOpt(String key, int backup)
    {
        return backup;
    }

    @Override
    public double getDoubleOpt(String key, double backup)
    {
        return backup;
    }

    @Override
    public String getStringOpt(String key, String backup)
    {
        return backup;
    }

    @Override
    public boolean getBoolOpt(String key, boolean backup)
    {
        return backup;
    }

    @Override
    public void setIntOpt(String key, int val)
    {

    }

    @Override
    public void setDoubleOpt(String key, double val)
    {

    }

    @Override
    public void setStringOpt(String key, String val)
    {

    }

    @Override
    public void setBoolOpt(String key, boolean val)
    {

    }
}
