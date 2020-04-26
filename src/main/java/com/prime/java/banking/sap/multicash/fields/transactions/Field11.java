package com.prime.java.banking.sap.multicash.fields.transactions;

import com.google.common.base.Strings;
import com.prime.java.banking.utils.NumberUtils;

import java.math.BigDecimal;

public class Field11 {

    public static final String FIELD_NAME = "Transaction Amount";
    public static final String DESCRIPTION = "Signed amount formatted to 2 decimal places.\n" +
            "For example: 13.41, -13.41";

    private BigDecimal value;

    public Field11(String debitTotal) {
        if (Strings.isNullOrEmpty(debitTotal)) {
            throw new IllegalArgumentException(FIELD_NAME+"/Field 11 cannot be null.");
        }
        debitTotal = NumberUtils.removeLeadingZeros(debitTotal);
        if(!NumberUtils.isAmount(debitTotal)){
            throw new NumberFormatException(FIELD_NAME+"/Field 11 must have a valid decimal value.");
        }
        this.value = new BigDecimal(debitTotal);
    }

    public BigDecimal getValue(){
        return this.value;
    }
}
