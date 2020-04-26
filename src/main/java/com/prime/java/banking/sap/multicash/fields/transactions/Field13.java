package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field13 {

    public static final String DESCRIPTION = "Intentionally left blank";
    public static final String FIELD_NAME = "Not Used";

    private String value;

    public Field13(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
