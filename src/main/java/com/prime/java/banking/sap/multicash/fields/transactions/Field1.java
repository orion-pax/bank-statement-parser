package com.prime.java.banking.sap.multicash.fields.transactions;

import com.google.common.base.Strings;

public class Field1 implements TransactionField{

    public static final String DESCRIPTION = "Populated with the BSB of the current account.\n" +
            "For Example 032-000";
    public static final String FIELD_NAME = "Bank Key";

    private String value;

    public Field1(String bankKey) {
        if (Strings.isNullOrEmpty(bankKey)) {
            throw new IllegalArgumentException(FIELD_NAME+"/Field 1 cannot be null.");
        }
        this.value = bankKey;
    }

    public String getValue(){
        return this.value;
    }
}
