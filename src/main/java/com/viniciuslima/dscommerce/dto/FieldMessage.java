package com.viniciuslima.dscommerce.dto;

public class FieldMessage {
    private String fieldName;
    private String message;

    public FieldMessage(String fildName, String message) {
        this.fieldName = fildName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
