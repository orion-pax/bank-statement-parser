package com.prime.java.banking.sap.multicash.fields.balances;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

public class Field3 {

    public static final String DESCRIPTION = "Statement Number is represented as a date formatted as YYNNN where NNN is the Julian date.\n" +
            "For Example 17002";
    public static final String FIELD_NAME = "Statement Number";

    private String value;

    public Field3(String statementNumber) {
        if (Strings.isNullOrEmpty(statementNumber)) {
            throw new IllegalArgumentException(FIELD_NAME+"/Field 3 cannot be null.");
        }
        if(!StringUtils.isNumeric(statementNumber)){
            throw new IllegalArgumentException(FIELD_NAME+"/Field 3 must have a numeric value.");
        }
        this.value = statementNumber;
    }

    public String getValue(){
        return this.value;
    }
}
