package com.VaiaIthilnaur;

import com.VaiaIthilnaur.Model.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Deanery dziekanat1 = new Deanery ("DSW");

        dziekanat1.addFieldOfStudy(new FieldOfStudy("Informatyka", "Informatyka jest wspaniala"));
        dziekanat1.addFieldOfStudy(new FieldOfStudy("Geodezja", "Geodezje chyba tez"));

        dziekanat1.addYearOfStudy(new YearOfStudy(2018, "2018.09.01", "2023.07.15", dziekanat1.getFieldOfStudy(0)));
        dziekanat1.addYearOfStudy(new YearOfStudy(2019, "2018.09.01", "2023.07.15", dziekanat1.getFieldOfStudy(1)));

        dziekanat1.addTeacher(new Teacher("Jan", "Oceniajacy", "m", 46, "Warszawka 1, Wro", 35656, "PhD", "pokoj 123"));

        dziekanat1.addSubject(new Subject("Matematyka", "Matma jest super", dziekanat1.getTeacher(0), dziekanat1.getFieldOfStudy(0)));
        dziekanat1.addSubject(new Subject("Matematyka", "Matma dla Geodezji", dziekanat1.getTeacher(0), dziekanat1.getFieldOfStudy(1)));
        dziekanat1.addSubject(new Subject("Fizyka", "Lol", dziekanat1.getTeacher(0), dziekanat1.getFieldOfStudy(0)));
        dziekanat1.addSubject(new Subject("Programowanie", "C++ mi amigo", dziekanat1.getTeacher(0), dziekanat1.getFieldOfStudy(0)));

        dziekanat1.addStudent(new Student("Jan", "Kowalski", "m", 23, "ul. Polna 1, Pasikurowice", 23436, dziekanat1.getYearOfStudy(0), 695640569, 1234));
        dziekanat1.addStudent(new Student("Ewa", "Kowalska", "k", 25, "ul. Polna 123, Warszawa", 43634, dziekanat1.getYearOfStudy(0), 654856845, 65467));
        dziekanat1.addStudent(new Student("John", "Tepy", "m", 22, "ul. Polna 123, Warszawa", 43634, dziekanat1.getYearOfStudy(0), 654856845, 65467));
        dziekanat1.addStudent(new Student("Ala", "Bystra", "k", 45, "ul. Polna 123, Warszawa", 43634, dziekanat1.getYearOfStudy(0), 654856845, 65467));
        dziekanat1.addStudent(new Student("Bogdan", "Obecny", "m", 34, "ul. Polna 123, Warszawa", 43634, dziekanat1.getYearOfStudy(0), 654856845, 65467));

        // Oceny z Matematyki dla Informatyki
        dziekanat1.setMarkForPass(3, dziekanat1.getSubject(0), dziekanat1.getStudent(0));
        dziekanat1.setMarkForPass(2, dziekanat1.getSubject(0), dziekanat1.getStudent(1));
        dziekanat1.setMarkForPass(6, dziekanat1.getSubject(0), dziekanat1.getStudent(2));
        dziekanat1.setMarkForPass(5, dziekanat1.getSubject(0), dziekanat1.getStudent(3));
        dziekanat1.setMarkForPass(3, dziekanat1.getSubject(0), dziekanat1.getStudent(4));
        // Oceny z Fizyki dla Informatyki
        dziekanat1.setMarkForPass(3, dziekanat1.getSubject(2), dziekanat1.getStudent(0));
        dziekanat1.setMarkForPass(3, dziekanat1.getSubject(2), dziekanat1.getStudent(1));
        dziekanat1.setMarkForPass(4, dziekanat1.getSubject(2), dziekanat1.getStudent(2));
        dziekanat1.setMarkForPass(5, dziekanat1.getSubject(2), dziekanat1.getStudent(3));
        dziekanat1.setMarkForPass(1, dziekanat1.getSubject(2), dziekanat1.getStudent(4));


        System.out.println("Uczelnia:" + dziekanat1.getUniversityName());
        System.out.println("==================================================================");
        System.out.println("Ilosc wszystkich studentow: "+ dziekanat1.numberOfAllStudents());
        System.out.println("Ilosc wszystkich studentow na kierunku Informatyka: "+ dziekanat1.numberOfStudentsOnField("Informatyka"));
        System.out.println("Ilosc wszystkich studentow na kierunku Geodezja: "+ dziekanat1.numberOfStudentsOnField("Geodezja"));
        System.out.println("Ilosc wszystkich studentow na kierunku Informatyka roku 2018: "+ dziekanat1.numberOfStudentsOnYear(2018, "Informatyka"));
        System.out.println("Student majacy najlepsza ocene z Fizyki to: "+ dziekanat1.getStudentBestMarkOnSubject(dziekanat1.getSubject(2)).getFullName());

        System.out.println("Srednia ocen dla Fizyki to: "+ dziekanat1.getAverageMarkOnSubject(dziekanat1.getSubject(2)));
        System.out.println("Srednia ocen dla roku 2018 Informatyki to: "+ dziekanat1.getAverageMarkOnYear(dziekanat1.getYearOfStudy(0)));

        System.out.println("Srednia wieku studentow na uczelni: "+ dziekanat1.getAverageStudentAge());
        System.out.println("\n");
        System.out.println(dziekanat1.getListOfStudent());
        System.out.println("\n");
        System.out.println(dziekanat1.getListOfSubjects());



    }
}
