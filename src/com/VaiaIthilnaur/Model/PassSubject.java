package com.VaiaIthilnaur.Model;

public class PassSubject {

    private Integer mark;
    private String dateOfPass;
    private Subject subject;
    private Student student;

    public PassSubject(Integer mark, String dateOfPass, Subject subject, Student student) {
        this.mark = mark;
        this.dateOfPass = dateOfPass;
        this.subject = subject;
        this.student = student;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getDateOfPass() {
        return dateOfPass;
    }

    public void setDateOfPass(String dateOfPass) {
        this.dateOfPass = dateOfPass;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "PassSubject{" +
                "mark=" + mark +
                ", dateOfPass='" + dateOfPass + '\'' +
                ", subject=" + subject +
                ", student=" + student +
                '}';
    }

}
