package com.prime.java.banking.sap.multicash.fields.balances;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

public class Field18 {

    public static final String DESCRIPTION = "Count of all transactions (Credit and Debit) for the current statement.";
    public static final String FIELD_NAME = "Number of Records in Statement";

    private int value;

    public Field18(String numberOfRecords) {

        if(!StringUtils.isNumeric(numberOfRecords)){
            throw new IllegalArgumentException(FIELD_NAME+"/Field 18 must have a numeric value.");
        }
        this.value = Integer.parseInt(numberOfRecords);
    }

    public int getValue(){
        return this.value;
    }
}
