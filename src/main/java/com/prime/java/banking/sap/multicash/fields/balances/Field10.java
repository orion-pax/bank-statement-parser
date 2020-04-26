package com.prime.java.banking.sap.multicash.fields.balances;

import com.google.common.base.Strings;

public class Field10 {

    public static final String DESCRIPTION = "Represents an alias for the current bank account.\n" +
            "For example: Receivables Account";
    public static final String FIELD_NAME = "Bank Account Holder";

    private String value;

    public Field10(String bankAccountHolder) {
        if (Strings.isNullOrEmpty(bankAccountHolder)) {
            throw new IllegalArgumentException(FIELD_NAME+"/Field 10 cannot be null.");
        }
        this.value = bankAccountHolder;
    }

    public String getValue(){
        return this.value;
    }
}
