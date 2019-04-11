package com.ctecgang.scholarshare;

public class User
{
    private String name;
    private String act;
    private String gender;
    private String gpa;
    private String ethnicity;
    private String state;

    public User()
    {
        this.name = "ryan";
        this.act = "34";
        this.gender = "male";
        this.gpa = "2.1";
        this.ethnicity = "white";
        this.state = "Utah";

    }
    public User(String act, String gender, String gpa, String ethnicity, String state)
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
