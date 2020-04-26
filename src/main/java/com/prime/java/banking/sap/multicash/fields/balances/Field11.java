package com.prime.java.banking.sap.multicash.fields.balances;

import com.google.common.base.Strings;

public class Field11 {

    public static final String DESCRIPTION = "Intentionally left blank";
    public static final String FIELD_NAME = "Special Account Name";

    private String value;

    public Field11(String specialAccountName) {
        this.value = specialAccountName;
    }

    public String getValue(){
        return this.value;
    }
}
