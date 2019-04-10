package com.ctecgang.scholarshare;

public class Controller {

    Scholarship myScholarship;
    User myUser;
    public boolean meetsRequirements(Scholarship scholarship, User user)
    {
        boolean qualifies = false;
        if(myScholarship.getACT() <= myUser.getActScore() && myScholarship.getGender().equals(myUser.getGender()) && myScholarship.getGPA() <= myUser.getGpa() && myScholarship.getEthnicity().equals(myUser.getEthnicity()) && myScholarship.getState().equals(myUser.getState()))
       {
           qualifies = true;
       }
       return qualifies;
    }
    public void sendData()
    {

    }
    public void retreiveData()
    {

    }
    public Controller(Scholarship scholarship, User user)
    {
    myScholarship = new Scholarship();
    myUser = new User();
    }
}
