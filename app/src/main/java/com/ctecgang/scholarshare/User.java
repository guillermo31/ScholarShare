package com.ctecgang.scholarshare;

public class User
{
    //private data members
    private double gpa;
    private int actScore;
    private String ethnicity;
    private String state;
    private String country;
    private String gender;
    private int age;
    //constructor

    public User()
    {
        gpa = 0.00;
        actScore = 0;
        ethnicity = "";
        state = "";
        country = "";
        gender = "";
        age = 0;


    }

public User(double gpa, int actScore, String ethnicity, String state, String country, String gender, int age)
{
    this.gpa = gpa;
    this.actScore = actScore;
    this.ethnicity = ethnicity;
    this.state = state;
    this.country = country;
    this.gender = gender;
    this.age = age;
}
    //methods





    //getters
    public double getGpa()
    {
        return gpa;
    }

    public int getActScore() {
        return actScore;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public String getGender() {
        return gender;
    }

    public String getState() {
        return state;
    }

    //setters
    public void setActScore(int actScore) {
        this.actScore = actScore;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setState(String state) {
        this.state = state;
    }
}
