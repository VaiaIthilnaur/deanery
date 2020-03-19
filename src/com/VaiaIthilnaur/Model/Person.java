package com.VaiaIthilnaur.Model;

public class Person {

    private String firstName;
    private String serName;
    private String sex;
    private Integer age;
    private String address;

    public Person(String firstName, String serName, String sex, Integer age, String address) {
        this.firstName = firstName;
        this.serName = serName;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName () {
        return this.firstName+" "+this.serName;
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", serName='" + serName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
