package com.prime.java.banking.sap.multicash.parser;

import com.google.common.base.Strings;
import com.prime.java.banking.sap.multicash.fields.balances.*;
import com.prime.java.banking.sap.multicash.models.SAPBalance;
import com.prime.java.banking.utils.StreamUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class SAPMulticashBalanceParser {
    public static List<SAPBalance> parseBalancesFromFile(String filePath){
        String fileContent = StreamUtils.readLineByLine(filePath);

        return parseBalances(fileContent);
    }

    public static List<SAPBalance> parseBalances(String content){

        List<SAPBalance> balances = new ArrayList<>();

        if (Strings.isNullOrEmpty(content)) {
            throw new IllegalArgumentException("Content cannot be null or empty.");
        }

        String[] lines = content.split(System.getProperty("line.separator"), -1);
        for(String line : lines){
            String balanceDetails[] = line.split(";", -1);
            balanceDetails = StringUtils.stripAll(balanceDetails);
            Field1 field1 = new Field1(balanceDetails[0]);
            Field2 field2 = new Field2(balanceDetails[1]);
            Field3 field3 = new Field3(balanceDetails[2]);
            Field4 field4 = new Field4(balanceDetails[3]);
            Field5 field5 = new Field5(balanceDetails[4]);
            Field6 field6 = new Field6(balanceDetails[5]);
            Field7 field7 = new Field7(balanceDetails[6].substring(0,balanceDetails[6].length()-1));
            Field8 field8 = new Field8(balanceDetails[7]);
            Field9 field9 = new Field9(balanceDetails[8]);
            Field10 field10 = new Field10(balanceDetails[9]);
            Field11 field11 = new Field11(balanceDetails[10]);
            Field12 field12 = new Field12(balanceDetails[11]);
            Field13 field13 = new Field13(balanceDetails[12]);
            Field14 field14 = new Field14(balanceDetails[13]);
            Field15 field15 = new Field15(balanceDetails[14]);
            Field16 field16 = new Field16(balanceDetails[15]);
            Field17 field17 = new Field17(balanceDetails[16]);
            Field18 field18 = new Field18(balanceDetails[17]);

            SAPBalance balance = new SAPBalance();
            balance.setField1(field1);
            balance.setField2(field2);
            balance.setField3(field3);
            balance.setField4(field4);
            balance.setField5(field5);
            balance.setField6(field6);
            balance.setField7(field7);
            balance.setField8(field8);
            balance.setField9(field9);
            balance.setField10(field10);
            balance.setField11(field11);
            balance.setField12(field12);
            balance.setField13(field13);
            balance.setField14(field14);
            balance.setField15(field15);
            balance.setField16(field16);
            balance.setField17(field17);
            balance.setField18(field18);

            balances.add(balance);
        }

        System.out.println("Number of balances "+ balances.size());
        return balances;
    }
}
