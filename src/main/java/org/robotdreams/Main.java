package org.robotdreams;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Professor class extends Staff implements Faculty
        Professor professor1 = new Professor();
        professor1.setTckn(1);
        professor1.setName("professorName1");
        professor1.setSurname("professorSurname1");
        professor1.setYearOfStartDate("2020");
        professor1.addFieldOfStudy("Statistics");
        professor1.addFieldOfStudy("Data Minning");
        professor1.getStaffInfo();

        Professor professor2 = new Professor();
        professor2.setTckn(2);
        professor2.setName("professorName2");
        professor2.setSurname("professorSurname2");
        professor2.setYearOfStartDate("2022");
        professor2.addFieldOfStudy("Computer Science");
        professor2.addFieldOfStudy("Software Development");
        professor2.getStaffInfo();

        Professor professor3 = new Professor();
        professor3.setTckn(3);
        professor3.setName("professorName3");
        professor3.setSurname("professorSurname3");
        professor3.setYearOfStartDate("2023");
        professor3.addFieldOfStudy("Computer Science");
        professor3.addFieldOfStudy("Cyber Security");
        professor3.addFieldOfStudy("Vehicle Security");
        professor3.getStaffInfo();

        // Rector class extends Staff implements AdministrativeStaff
        Rector rector1 = new Rector();
        rector1.setTckn(4);
        rector1.setName("rectorName4");
        rector1.setSurname("rectorSurname4");
        rector1.setYearOfStartDate("2020");
        rector1.addFieldOfAdministration("Campus Management");
        rector1.addFieldOfAdministration("Department Management");
        rector1.getStaffInfo();
    }
}