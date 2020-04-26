package com.prime.java.banking.sap.multicash.fields.balances;

import com.google.common.base.Strings;
import com.prime.java.banking.utils.NumberUtils;

import java.math.BigDecimal;

public class Field9 {

    public static final String DESCRIPTION = "Account Closing Balance. Signed amount formatted to 2 decimal places.\n" +
            "For example: 13.41, -13.41";
    public static final String FIELD_NAME = "Closing Balance";

    private BigDecimal value;

    public Field9(String closingBalance) {
        if (Strings.isNullOrEmpty(closingBalance)) {
            throw new IllegalArgumentException(FIELD_NAME+"/Field 8 cannot be null.");
        }
        if(!NumberUtils.isAmount(closingBalance)){
            throw new NumberFormatException(FIELD_NAME+"/Field 8 must have a valid decimal value.");
        }
        this.value = new BigDecimal(closingBalance);
    }

    public BigDecimal getValue(){
        return this.value;
    }
}
