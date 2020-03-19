package com.VaiaIthilnaur.Model;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Deanery {

    private String universityName;

    private List<Student> listOfStudents; // baza studentow
    private List<Teacher> listOfTeachers; // baza wykladowcow
    private List<FieldOfStudy> listOfFields; // baza kierunkow
    private List<YearOfStudy> listOfYears; //baza rocznikow
    private List<Subject> listOfSubjects; //baza przedmiotow
    private List<PassSubject> listOfPasses; // lista zaliczen przedmiotow

    public Deanery(String universityName) {
        this.universityName = universityName;
        this.listOfFields = new ArrayList<>();
        this.listOfPasses = new ArrayList<>();
        this.listOfStudents = new ArrayList<>();
        this.listOfSubjects = new ArrayList<>();
        this.listOfTeachers = new ArrayList<>();
        this.listOfYears = new ArrayList<>();
    }

    public Integer numberOfAllStudents () {

        return listOfStudents.size();
    }

    public Integer numberOfStudentsOnField (String field) {
        Integer count = 0;
        for (Student student : listOfStudents) {
            if(student.getYearOfStudy().getFieldOfStudy().getFieldName() == field) {
                count = count+1;
            }
        }

        return count;
    }

    public Integer numberOfStudentsOnYear (Integer y, String field) {
        Integer count = 0;
        Iterator<Student> iterator = listOfStudents.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if((student.getYearOfStudy().getYear().equals(y)) &&
                    (student.getYearOfStudy().getFieldOfStudy().getFieldName().equals(field))) {
                count = count+1;
            }
        }
        return count;
    }

    public Student getStudentBestMarkOnSubject (Subject subject) {

        List<PassSubject> subjects = new ArrayList<>();

        subjects = this.listOfPasses.stream()
                .filter( c -> c.getSubject().equals(subject))
                .collect(Collectors.toList());

        PassSubject bestSubjectMarked = subjects.stream()
                .max(Comparator.comparing(PassSubject::getMark))
                .orElseThrow(NoSuchElementException::new);

        return bestSubjectMarked.getStudent();

    }

    public Double getAverageMarkOnSubject (Subject subject) {

        Double average = 0.0;
        Double markSum = 0.0;
        Double markNumber = 0.0;

        Iterator<PassSubject> iterator = this.listOfPasses.iterator();
        while (iterator.hasNext()) {
            PassSubject s = iterator.next();
            if(s.getSubject().equals(subject)) {
                markNumber = markNumber+1;
                markSum = markSum + s.getMark();
            }
        }

        average = (markSum/markNumber);
        return average;
    }

    public Double getAverageMarkOnYear (YearOfStudy year) {

        Double average = 0.0;
        Double markSum = 0.0;
        Double markNumber = 0.0;

        Iterator<PassSubject> iterator = this.listOfPasses.iterator();
        while (iterator.hasNext()) {
            PassSubject s = iterator.next();
            if(s.getStudent().getYearOfStudy().equals(year)) {
                markNumber = markNumber+1;
                markSum = markSum + s.getMark();
            }
        }

        average = (markSum/markNumber);
        return average;
    }

    public Double getAverageStudentAge () {

        Double average = 0.0;
        Double ageSum = 0.0;
        Double studentNumber = 0.0;

        Iterator<Student> iterator = this.listOfStudents.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            studentNumber = studentNumber+1;
            ageSum = ageSum + s.getAge();
        }

        average = (ageSum/studentNumber);
        return average;
    }

    public String getListOfStudent () {
        String listStudents ="Lista studentow na uczelni:\n";
        listStudents = listStudents + "Imie i nazwisko, Wiek, Kierunek";

        Iterator<Student> iterator = this.listOfStudents.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            listStudents = listStudents + "\n" + s.getFullName() + ", " + s.getAge() + ", " + s.getYearOfStudy().getFieldOfStudy().getFieldName();
        }

        return listStudents;
    }

    public String getListOfSubjects () {
        String listSubjects ="Lista przedmiotow na uczelni:\n";
        listSubjects = listSubjects + "Nazwa, Opis, Wykladowca, Kierunek";

        Iterator<Subject> iterator = this.listOfSubjects.iterator();
        while (iterator.hasNext()) {
            Subject s = iterator.next();
            listSubjects = listSubjects + "\n" + s.getSubjectName() + ", " + s.getSubjectDescription() + ", " + s.getTeacher().getFullName() + ", " + s.getFieldOfStudy().getFieldName();
        }

        return listSubjects;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }


    public void addStudent (Student student) {
        this.listOfStudents.add(student);
    }

    public Student getStudent (Integer id) {
        return listOfStudents.get(id);
    }

    public void addTeacher (Teacher teacher) {
        this.listOfTeachers.add(teacher);
    }

    public Teacher getTeacher (Integer id) {
        return listOfTeachers.get(id);
    }

    public void addSubject (Subject subject) {
        this.listOfSubjects.add(subject);
    }

    public Subject getSubject (Integer id) {
        return listOfSubjects.get(id);
    }

    public void addYearOfStudy (YearOfStudy year) {
        this.listOfYears.add(year);
    }

    public YearOfStudy getYearOfStudy (Integer id ) {
        return listOfYears.get(id);
    }

    public void addFieldOfStudy (FieldOfStudy field) {
        this.listOfFields.add(field);
    }

    public FieldOfStudy getFieldOfStudy (Integer id ) {
        return listOfFields.get(id);
    }


    public void setMarkForPass (Integer mark, Subject subject, Student student) {
        listOfPasses.add(new PassSubject(mark,"dzisiaj", subject, student));
    }



    @Override
    public String toString() {
        return "Deanery{" +
                "universityName='" + universityName + '\'' +
                ",\n listOfStudents=" + listOfStudents +
                ",\n listOfTeachers=" + listOfTeachers +
                ",\n listOfFields=" + listOfFields +
                ",\n listOfYears=" + listOfYears +
                ",\n listOfSubjects=" + listOfSubjects +
                ",\n listOfPasses=" + listOfPasses +
                '}';
    }
}
