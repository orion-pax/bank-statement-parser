package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field14 {

    public static final String FIELD_NAME = "Posting Date";
    public static final String DESCRIPTION = "Intentionally left blank";

    private String value;

    public Field14(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
