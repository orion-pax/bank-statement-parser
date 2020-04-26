package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field30 {

    public static final String FIELD_NAME = "Business Partner";
    public static final String DESCRIPTION = "Intentionally left blank";

    private String value;

    public Field30(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
