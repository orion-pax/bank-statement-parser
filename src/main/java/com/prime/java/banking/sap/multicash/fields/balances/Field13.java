package com.prime.java.banking.sap.multicash.fields.balances;

public class Field13 {

    public static final String DESCRIPTION = "Intentionally left blank";
    public static final String FIELD_NAME = "Life End";

    private String value;

    public Field13(String lifeEnd) {
        this.value = lifeEnd;
    }

    public String getValue(){
        return this.value;
    }
}
