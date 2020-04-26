package com.prime.java.banking.sap.multicash.fields.transactions;

public class Field10 {

    public static final String FIELD_NAME = "Serial Number";
    public static final String DESCRIPTION = "Transaction serial code. For Cheque deposits this will contain the cheque number.";

    private String value;

    public Field10(String fieldValue) {
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
