package org.robotdreams;

import java.util.ArrayList;

public class Professor extends Staff implements Faculty{
    private ArrayList<String> fieldOfStudy = new ArrayList<String>();
    private ArrayList<String> publications = new ArrayList<String>();
    // constractors
    public Professor() {
    }

    /*
    public Professor(ArrayList<String> fieldOfStudy, ArrayList<String> publications) {
        this.fieldOfStudy = fieldOfStudy;
        this.publications = publications;
    }
     */

    @Override
    public void addFieldOfStudy(String _fieldOfStudy) {
        this.fieldOfStudy.add(_fieldOfStudy);
    }

    @Override
    public ArrayList<String> getFieldOfStudy() {
        return fieldOfStudy;
    }

    @Override
    public void getStaffInfo() {
        System.out.println("Faculty Member Infos : \n -- tckn : "
                + getTckn() + "\n -- name : "
                + getName() + "\n -- surname : "
                + getSurname() + "\n -- yearOfStartDate : "
                + getYearOfStartDate() + "\n -- fieldOfStudy : "
                + getFieldOfStudy());
    }
}
