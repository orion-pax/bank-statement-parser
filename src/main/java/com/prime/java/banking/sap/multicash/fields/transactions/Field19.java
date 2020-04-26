package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field19 {

    public static final String FIELD_NAME = "Note to Payee 4";
    public static final String DESCRIPTION = "Contains the first 27 characters of the transaction narrative";

    private String value;

    public Field19(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
