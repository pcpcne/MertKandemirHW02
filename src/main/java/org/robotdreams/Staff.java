package org.robotdreams;

public abstract class Staff {
    private int tckn;
    private String name;
    private String surname;
    private String yearOfStartDate;

    //abstract method
    public abstract void getStaffInfo();

    public int getTckn(){
        return tckn;
    }

    public void setTckn(int _tckn){
        this.tckn = _tckn;
    }

    public String getName(){
        return name;
    }

    public void setName(String _name){
        this.name = _name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String _surname){
        this.surname = _surname;
    }

    public String getYearOfStartDate(){
        return yearOfStartDate;
    }

    public void setYearOfStartDate(String _yearOfStartDate){
        this.yearOfStartDate = _yearOfStartDate;
    }
}
