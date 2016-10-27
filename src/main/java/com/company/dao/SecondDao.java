package com.company.dao;

import org.springframework.stereotype.Component;

@Component
public class SecondDao {
    private String testField;

    public SecondDao() {
    }

    public SecondDao(String testField) {
        this.testField = testField;
    }

    public String getTestField() {
        return testField;
    }

    public void setTestField(String testField) {
        this.testField = testField;
    }
}
