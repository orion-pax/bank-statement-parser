package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field26 {

    public static final String FIELD_NAME = "Note to Payee 11";
    public static final String DESCRIPTION = "Intentionally left blank";

    private String value;

    public Field26(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
