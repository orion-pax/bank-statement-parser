package com.prime.java.banking.sap.multicash.fields.transactions;

public class  Field8 {

    public static final String DESCRIPTION = "Intentionally left blank";
    public static final String FIELD_NAME = "Not Used";

    private String value;

    public Field8(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
