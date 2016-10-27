package com.company.dao;

import org.springframework.stereotype.Component;

@Component
public class FirstDao {
    private String testField;

    public FirstDao() {
    }

    public FirstDao(String testField) {
        this.testField = testField;
    }

    public String getTestField() {
        return testField;
    }

    public void setTestField(String testField) {
        this.testField = testField;
    }
}
