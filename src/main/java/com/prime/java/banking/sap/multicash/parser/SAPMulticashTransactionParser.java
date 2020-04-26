package com.prime.java.banking.sap.multicash.parser;

import com.google.common.base.Strings;
import com.prime.java.banking.sap.multicash.fields.balances.BalanceField;
import com.prime.java.banking.sap.multicash.fields.transactions.*;
import com.prime.java.banking.sap.multicash.models.SAPBalance;
import com.prime.java.banking.sap.multicash.models.SAPTransaction;
import com.prime.java.banking.utils.StreamUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SAPMulticashTransactionParser {



    public static List<SAPTransaction> parseTransactionsFromFile(String filePath){
        String fileContent = StreamUtils.readLineByLine(filePath);

        return parseTransactions(fileContent);
    }

    public static List<SAPTransaction> parseTransactions(String content){
        List<SAPTransaction> transactions = new ArrayList<>();

        if (Strings.isNullOrEmpty(content)) {
            throw new IllegalArgumentException("Content cannot be null or empty.");
        }

        String[] lines = content.split(System.getProperty("line.separator"), -1);
        for(String line : lines){
            String transactionDetails[] = line.split(";", -1);
            transactionDetails = StringUtils.stripAll(transactionDetails);
            Field1 field1 = new Field1(transactionDetails[0]);
            Field2 field2 = new Field2(transactionDetails[1]);
            Field3 field3 = new Field3(transactionDetails[2]);
            Field4 field4 = new Field4(transactionDetails[3]);
            Field5 field5 = new Field5(transactionDetails[4]);
            Field6 field6 = new Field6(transactionDetails[5]);
            Field7 field7 = new Field7(transactionDetails[6]);
            Field8 field8 = new Field8(transactionDetails[7]);
            Field9 field9 = new Field9(transactionDetails[8]);
            Field10 field10 = new Field10(transactionDetails[9]);
            Field11 field11 = new Field11(transactionDetails[10]);
            Field12 field12 = new Field12(transactionDetails[11]);
            Field13 field13 = new Field13(transactionDetails[12]);
            Field14 field14 = new Field14(transactionDetails[13]);
            Field15 field15 = new Field15(transactionDetails[14]);
            Field16 field16 = new Field16(transactionDetails[15]);
            Field17 field17 = new Field17(transactionDetails[16]);
            Field18 field18 = new Field18(transactionDetails[17]);
            Field19 field19 = new Field19(transactionDetails[18]);
            Field20 field20 = new Field20(transactionDetails[19]);
            Field21 field21 = new Field21(transactionDetails[20]);
            Field22 field22 = new Field22(transactionDetails[21]);
            Field23 field23 = new Field23(transactionDetails[22]);
            Field24 field24 = new Field24(transactionDetails[23]);
            Field25 field25 = new Field25(transactionDetails[24]);
            Field26 field26 = new Field26(transactionDetails[25]);
            Field27 field27 = new Field27(transactionDetails[26]);
            Field28 field28 = new Field28(transactionDetails[27]);
            Field29 field29 = new Field29(transactionDetails[28]);
            Field30 field30 = new Field30(transactionDetails[29]);
            Field31 field31 = new Field31(transactionDetails[30]);
            Field32 field32 = new Field32(transactionDetails[31]);
            Field33 field33 = new Field33(transactionDetails[32]);
            Field34 field34 = new Field34(transactionDetails[33]);
            Field35 field35 = new Field35(transactionDetails[34]);

            SAPTransaction transaction = new SAPTransaction();
            transaction.setField1(field1);
            transaction.setField2(field2);
            transaction.setField3(field3);
            transaction.setField4(field4);
            transaction.setField5(field5);
            transaction.setField6(field6);
            transaction.setField7(field7);
            transaction.setField8(field8);
            transaction.setField9(field9);
            transaction.setField10(field10);
            transaction.setField11(field11);
            transaction.setField12(field12);
            transaction.setField13(field13);
            transaction.setField14(field14);
            transaction.setField15(field15);
            transaction.setField16(field16);
            transaction.setField17(field17);
            transaction.setField18(field18);
            transaction.setField19(field19);
            transaction.setField20(field20);
            transaction.setField21(field21);
            transaction.setField22(field22);
            transaction.setField23(field23);
            transaction.setField24(field24);
            transaction.setField25(field25);
            transaction.setField26(field26);
            transaction.setField27(field27);
            transaction.setField28(field28);
            transaction.setField29(field29);
            transaction.setField30(field30);
            transaction.setField31(field31);
            transaction.setField32(field32);
            transaction.setField33(field33);
            transaction.setField34(field34);
            transaction.setField35(field35);

            transactions.add(transaction);
        }

        System.out.println("Number of transactins: "+ transactions.size());
        return transactions;
    }



}
