package org.robotdreams;

import java.util.ArrayList;

public class Rector extends Staff implements AdministrativeStaff{
    private ArrayList<String> fieldOfAdministration = new ArrayList<String>();
    private ArrayList<String> responsibilities = new ArrayList<String>();

    // constractors
    public Rector() {
    }


    @Override
    public void addFieldOfAdministration(String _fieldOfAdministration) {
        this.fieldOfAdministration.add(_fieldOfAdministration);
    }

    @Override
    public ArrayList<String> getFieldOfAdministration() {
        return fieldOfAdministration;
    }

    @Override
    public void getStaffInfo() {
        System.out.println("Faculty Member Infos : \n ** tckn : "
                + getTckn() + "\n ** name : "
                + getName() + "\n ** surname : "
                + getSurname() + "\n ** yearOfStartDate : "
                + getYearOfStartDate() + "\n ** fieldOfAdministration : "
                + getFieldOfAdministration());
    }
}
