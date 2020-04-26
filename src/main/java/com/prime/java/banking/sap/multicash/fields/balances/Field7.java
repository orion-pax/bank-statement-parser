package com.prime.java.banking.sap.multicash.fields.balances;

import com.google.common.base.Strings;
import com.prime.java.banking.utils.NumberUtils;

import java.math.BigDecimal;

public class Field7 {

    public static final String DESCRIPTION = "Sum of all debit transactions for the current statement represented as an absolute value.";
    public static final String FIELD_NAME = "Debit Total";

    private BigDecimal value;

    public Field7(String debitTotal) {
        if (Strings.isNullOrEmpty(debitTotal)) {
            throw new IllegalArgumentException("Debit Total/Field 7 cannot be null.");
        }
        if(!NumberUtils.isAmount(debitTotal)){
            throw new NumberFormatException("Debit Total/Field 7 must have a valid decimal value.");
        }
        this.value = new BigDecimal(debitTotal);
    }

    public BigDecimal getValue(){
        return this.value;
    }
}
