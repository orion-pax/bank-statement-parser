package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field6 {

    public static final String FIELD_NAME = "Note to Payee 1";
    public static final String DESCRIPTION = "Contains the first 27 characters of the transaction narrative";

    private String value;

    public Field6(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
