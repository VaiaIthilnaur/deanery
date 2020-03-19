package com.VaiaIthilnaur.Model;

public class Student extends Person {

    private Integer indexNumber;
    private YearOfStudy yearOfStudy;
    private Integer socialNumber;
    private Integer idNumber; // Legitymacja

    public Student(String firstName, String serName, String sex, Integer age, String address, Integer indexNumber, YearOfStudy yearOfStudy, Integer socialNumber, Integer idNumber) {
        super(firstName, serName, sex, age, address);
        this.indexNumber = indexNumber;
        this.yearOfStudy = yearOfStudy;
        this.socialNumber = socialNumber;
        this.idNumber = idNumber;
    }

    public Integer getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(Integer indexNumber) {
        this.indexNumber = indexNumber;
    }

    public YearOfStudy getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(YearOfStudy yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Integer getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(Integer socialNumber) {
        this.socialNumber = socialNumber;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "indexNumber=" + indexNumber +
                ", yearOfStudy=" + yearOfStudy +
                ", socialNumber=" + socialNumber +
                ", idNumber=" + idNumber +
                '}';
    }
}
