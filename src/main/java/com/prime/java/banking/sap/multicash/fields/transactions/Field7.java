package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field7 {

    public static final String FIELD_NAME = "Bank Posting Text";
    public static final String DESCRIPTION = "Intentionally left blank";

    private String value;

    public Field7(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
