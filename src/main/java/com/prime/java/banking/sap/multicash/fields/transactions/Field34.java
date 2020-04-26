package com.prime.java.banking.sap.multicash.fields.transactions;

import com.google.common.base.Strings;
import com.prime.java.banking.utils.NumberUtils;
import org.apache.commons.lang3.StringUtils;

public class Field34 {

    public static final String FIELD_NAME = "Business Transaction Code";
    public static final String DESCRIPTION = " three digit transaction Westpac assigned transaction code";

    private String value;

    public Field34(String fieldValue) {
//        if (Strings.isNullOrEmpty(fieldValue)) {
//            throw new IllegalArgumentException(FIELD_NAME+"/Field 34 cannot be null.");
//        }

        if(!Strings.isNullOrEmpty(fieldValue) && !NumberUtils.isCorrectDataLength(fieldValue,3)){
            throw new NumberFormatException(FIELD_NAME+"/Field 34 must have a 5 digit numeric value.");
        }
        this.value = fieldValue;
    }

    public String getValue(){
        return this.value;
    }
}
