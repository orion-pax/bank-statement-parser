package com.prime.java.banking.sap.multicash.fields.balances;

import com.google.common.base.Strings;
import com.prime.java.banking.utils.NumberUtils;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

public class Field6 {

    public static final String DESCRIPTION = "Account Opening Balance. Signed amount formatted to 2 decimal places.\n" +
            "For example: 13.41, -13.41";
    public static final String FIELD_NAME = "Opening Balance";

    private BigDecimal value;

    public Field6(String openingBalance) {
        if (Strings.isNullOrEmpty(openingBalance)) {
            throw new IllegalArgumentException("Opening Balance/Field 6 cannot be null.");
        }
        if(!NumberUtils.isAmount(openingBalance)){
            throw new NumberFormatException("Opening Balance/Field 6 must have a valid decimal value.");
        }
        this.value = new BigDecimal(openingBalance);
    }

    public BigDecimal getValue(){
        return this.value;
    }
}
