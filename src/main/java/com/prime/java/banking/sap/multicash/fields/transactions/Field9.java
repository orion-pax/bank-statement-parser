package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field9 {

    public static final String FIELD_NAME = "Text Key";
    public static final String DESCRIPTION = "Intentionally left blank";

    private String value;

    public Field9(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
