package com.prime.java.banking.sap.multicash.fields.transactions;

import com.google.common.base.Strings;

public class Field4 {

    public static final String DESCRIPTION = "Statement Date formatted as DD.MM.YY";
    public static final String FIELD_NAME = "Statement Date";

    private String value;

    public Field4(String statementDate) {
        if (Strings.isNullOrEmpty(statementDate)) {
            throw new IllegalArgumentException(FIELD_NAME+"/Field 4 cannot be null.");
        }

        if (!statementDate.matches("^(\\d{2}\\.\\d{2}\\.\\d{2})$")) {
            throw new IllegalArgumentException("Statement Date/Field 4: Unexpected date format.");

        }
        this.value = statementDate;
    }

    public String getValue() {
        return this.value;
    }
}
