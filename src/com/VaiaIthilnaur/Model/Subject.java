package com.VaiaIthilnaur.Model;

public class Subject {

    private String subjectName;
    private String subjectDescription;
    private Teacher teacher;
    private FieldOfStudy fieldOfStudy;

    public Subject(String subjectName, String subjectDescription, Teacher teacher, FieldOfStudy fieldOfStudy) {
        this.subjectName = subjectName;
        this.subjectDescription = subjectDescription;
        this.teacher = teacher;
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public FieldOfStudy getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(FieldOfStudy fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectDescription='" + subjectDescription + '\'' +
                ", teacher=" + teacher +
                ", fieldOfStudy=" + fieldOfStudy +
                '}';
    }
}
