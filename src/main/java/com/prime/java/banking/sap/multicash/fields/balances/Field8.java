package com.prime.java.banking.sap.multicash.fields.balances;

import com.google.common.base.Strings;
import com.prime.java.banking.utils.NumberUtils;

import java.math.BigDecimal;

public class Field8 {

    public static final String DESCRIPTION = "Sum of all credit transactions for the current statement.";
    public static final String FIELD_NAME = "Credit Total";

    private BigDecimal value;

    public Field8(String creditTotal) {
        if (Strings.isNullOrEmpty(creditTotal)) {
            throw new IllegalArgumentException("Credit Total/Field 8 cannot be null.");
        }
        if(!NumberUtils.isAmount(creditTotal)){
            throw new NumberFormatException("Credit Total/Field 8 must have a valid decimal value.");
        }
        this.value = new BigDecimal(creditTotal);
    }

    public BigDecimal getValue(){
        return this.value;
    }
}
