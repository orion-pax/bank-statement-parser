package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field32 {

    public static final String FIELD_NAME = "Bank Key of Partner's bank";
    public static final String DESCRIPTION = "Intentionally left blank";

    private String value;

    public Field32(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
