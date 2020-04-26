package com.prime.java.banking.sap.multicash.fields.transactions;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

public class Field2 {

    public static final String DESCRIPTION = "Populated with the account number.\n" +
            "For Example 136465";
    public static final String FIELD_NAME = "Bank Account Number";

    private String value;

    public Field2(String bankAccountNumber) {
        if (Strings.isNullOrEmpty(bankAccountNumber)) {
            throw new IllegalArgumentException(FIELD_NAME+"/Field 2 cannot be null.");
        }
        if(!StringUtils.isNumeric(bankAccountNumber)){
            throw new IllegalArgumentException(FIELD_NAME+"/Field 2 must have a numeric value.");
        }
        this.value = bankAccountNumber;
    }

    public String getValue(){
        return this.value;
    }
}
