package com.VaiaIthilnaur.Model;

import java.util.Date;

public class YearOfStudy {

    private Integer year;
    private String startDate;
    private String finishDate;
    private FieldOfStudy fieldOfStudy;

    public YearOfStudy(Integer year, String startDate, String finishDate, FieldOfStudy fieldOfStudy) {
        this.year = year;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.fieldOfStudy = fieldOfStudy;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public FieldOfStudy getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(FieldOfStudy fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public String toString() {
        return "YearOfStudy{" +
                "year=" + year +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", fieldOfStudy=" + fieldOfStudy +
                '}';
    }
}
