package com.prime.java.banking.sap.multicash.fields.balances;

public class Field12 {

    public static final String DESCRIPTION = "Intentionally left blank";
    public static final String FIELD_NAME = "Life Start";

    private String value;

    public Field12(String lifeStart) {
        this.value = lifeStart;
    }

    public String getValue(){
        return this.value;
    }
}
