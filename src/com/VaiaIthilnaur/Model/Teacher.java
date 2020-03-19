package com.VaiaIthilnaur.Model;

public class Teacher extends Person {

    private Integer employeeNumber;
    private String degree;
    private String rommNumber;

    public Teacher(String firstName, String serName, String sex, Integer age, String address, Integer employeeNumber, String degree, String rommNumber) {
        super(firstName, serName, sex, age, address);
        this.employeeNumber = employeeNumber;
        this.degree = degree;
        this.rommNumber = rommNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getRommNumber() {
        return rommNumber;
    }

    public void setRommNumber(String rommNumber) {
        this.rommNumber = rommNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "\nemployeeNumber=" + employeeNumber +
                "\n, degree='" + degree + '\'' +
                "\n, rommNumber='" + rommNumber + '\'' +
                '}';
    }
}
