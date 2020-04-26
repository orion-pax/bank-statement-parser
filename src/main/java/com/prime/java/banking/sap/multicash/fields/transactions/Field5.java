package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field5 {

    public static final String DESCRIPTION = "Intentionally left blank";
    public static final String FIELD_NAME = "Primary Note Number";

    private String value;

    public Field5(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
