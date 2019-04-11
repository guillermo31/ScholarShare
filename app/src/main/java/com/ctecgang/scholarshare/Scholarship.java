package com.ctecgang.scholarshare;

public class Scholarship {
    private String act;
    private String gender;
    private String gpa;
    private String ethnicity;
    private String state;
    protected Scholarship()
    {
        this.act = "";
        this.gender = "";
        this.gpa = "";
        this.ethnicity = "";
        this.state = "";
    }

    protected Scholarship(String act, String gender, String gpa, String ethnicity, String state)
    {
        this.act = act;
        this.gender = gender;
        this.gpa = gpa;
        this.ethnicity = ethnicity;
        this.state = state;
    }

}
