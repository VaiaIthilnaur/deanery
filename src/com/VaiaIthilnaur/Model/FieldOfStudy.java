package com.VaiaIthilnaur.Model;

public class FieldOfStudy {

    private String  fieldName;
    private String  fieldDescription;

    public FieldOfStudy(String fieldName, String fieldDescription) {
        this.fieldName = fieldName;
        this.fieldDescription = fieldDescription;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldDescription() {
        return fieldDescription;
    }

    public void setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
    }

    @Override
    public String toString() {
        return "FieldOfStudy{" +
                "fieldName='" + fieldName + '\'' +
                ", fieldDescription='" + fieldDescription + '\'' +
                '}';
    }


}
