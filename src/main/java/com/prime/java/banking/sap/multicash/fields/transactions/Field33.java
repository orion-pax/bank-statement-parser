package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field33 {

    public static final String FIELD_NAME = "Bank Account Number of the Partner";
    public static final String DESCRIPTION = "Intentionally left blank";

    private String value;

    public Field33(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
