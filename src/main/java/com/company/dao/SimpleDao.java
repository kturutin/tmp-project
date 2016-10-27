package com.company.dao;

import org.springframework.stereotype.Component;

@Component
public class SimpleDao {
    private String testField;

    public SimpleDao() {
    }

    public SimpleDao(String testField) {
        this.testField = testField;
    }

    public String getTestField() {
        return testField;
    }

    public void setTestField(String testField) {
        this.testField = testField;
    }
}
