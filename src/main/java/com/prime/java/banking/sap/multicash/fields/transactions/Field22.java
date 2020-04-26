package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field22 {

    public static final String FIELD_NAME = "Note to Payee 7";
    public static final String DESCRIPTION = "Contains the first 28 characters of the transaction narrative";

    private String value;

    public Field22(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
