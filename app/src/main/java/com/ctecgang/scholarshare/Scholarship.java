package com.ctecgang.scholarshare;

public class Scholarship {
    private String name;
    private String act;
    private String gender;
    private String gpa;
    private String ethnicity;
    private String state;
    private String link;

    protected Scholarship()
    {
        this.name = "the best scholar";
        this.act = "35";
        this.gender = "who knows";
        this.gpa = "4.0";
        this.ethnicity = "prefer not to answer";
        this.state = "California";
        this.link = "www.google.com";
    }

    protected Scholarship(String name, String act, String gender, String gpa, String ethnicity, String state)
    {
        this.name = name;
        this.act = act;
        this.gender = gender;
        this.gpa = gpa;
        this.ethnicity = ethnicity;
        this.state = state;
    }

    public String getName()
    {
        return name;
    }
    public String getAct()
    {
        return act;
    }
    public String getGender()
    {
        return gender;
    }
    public String getGpa()
    {
        return gpa;
    }
    public String getEthnicity()
    {
        return ethnicity;
    }
    public String getState()
    {
        return state;
    }

}
