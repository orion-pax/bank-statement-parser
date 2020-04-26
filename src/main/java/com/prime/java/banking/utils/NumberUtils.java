package com.prime.java.banking.utils;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

public class NumberUtils {

    public static boolean isAmount(String value) {
        if (value == null || value.trim().length() == 0) {
            return false;
        }
        if(value.trim().matches("^(-?\\d+\\.\\d{2})$")){
            return true;
        }
        return false;
    }

    public static boolean isCorrectDataLength(String value, int length) {
        if (value == null || value.trim().length() == 0) {
            return false;
        }
        if(value.matches("^(-?\\d{"+length+"})$")){
            return true;
        }
        return false;
    }

    public static String removeLeadingZeros(String value){
        if (Strings.isNullOrEmpty(value)) {
            throw new IllegalArgumentException("Value cannot be null.");
        }

        String strippedData = StringUtils.stripStart(value,"0");
        return  strippedData.trim();
    }
}
