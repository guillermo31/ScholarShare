package com.ctecgang.scholarshare;

public class Scholarship {
    private int ACT;
    private String Gender;
    private double GPA;
    private String Ethnicity;
    private String State;
    protected Scholarship()
    {

    }
    protected Scholarship(String ACT, String Gender, String GPA, String Ethnicity, String State)
    {
        this.ACT = "";
        this.Gender = "";
        this.GPA = "";
        this.Ethnicity = "";
        this.State = "";
    }
    public String getACT()
    {
        return ACT;
    }
    public String getGender()
    {
        return Gender;
    }
    public String getGPA()
    {
        return GPA;
    }
    public String getEthnicity()
    {
        return Ethnicity;
    }
    public String getState()
    {
       return State;
    }

}
