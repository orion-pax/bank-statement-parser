package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field20 {

    public static final String FIELD_NAME = "Note to Payee 5";
    public static final String DESCRIPTION = "Contains the first 12 characters of the transaction narrative";

    private String value;

    public Field20(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
