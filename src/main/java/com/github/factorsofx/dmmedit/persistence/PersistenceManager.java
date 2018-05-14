package com.github.factorsofx.dmmedit.persistence;

public interface PersistenceManager
{
    int getIntOpt(String key, int backup);

    double getDoubleOpt(String key, double backup);

    String getStringOpt(String key, String backup);

    boolean getBoolOpt(String key, boolean backup);

    void setIntOpt(String key, int val);

    void setDoubleOpt(String key, double val);

    void setStringOpt(String key, String val);

    void setBoolOpt(String key, boolean val);
}
