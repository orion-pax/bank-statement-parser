package com.prime.java.banking.sap.multicash.fields.balances;

import com.google.common.base.Strings;

public class Field5 {

    public static final String DESCRIPTION = "Currency code will be represented as a valid ISO 4217 currency code.\n" +
            "For Example AUD";
    public static final String FIELD_NAME = "Currency";

    private String value;

    public Field5(String currency) {
        if (Strings.isNullOrEmpty(currency)) {
            throw new IllegalArgumentException("Currency/Field 5 cannot be null.");
        }

        if (!currency.matches("^([A-Z]{3})$")) {
            throw new IllegalArgumentException("Currency/Field 4: Unexpected currency format.");

        }
        this.value = currency;
    }

    public String getValue() {
        return this.value;
    }
}
