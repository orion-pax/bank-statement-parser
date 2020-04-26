package com.prime.java.banking;

import com.prime.java.banking.sap.multicash.models.SAPBalance;
import com.prime.java.banking.sap.multicash.models.SAPTransaction;
import com.prime.java.banking.sap.multicash.parser.SAPMulticashBalanceParser;
import com.prime.java.banking.sap.multicash.parser.SAPMulticashTransactionParser;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

//        Field5 field4 = new Field5("AuD");
//        System.out.println(field4.getValue());

        int i;
//        for (i = 15; i < 38; i++) {
//            System.out.println("Field"+i+" field"+i+" = new Field"+i+"(transactionDetails["+(i-1)+"]);");
//        }
//
//        for (i = 1; i < 38; i++) {
//            System.out.println("transaction.setField"+i+"(field"+i+");");
//        }

//        System.out.println(NumberUtils.removeLeadingZeros("00000000323638.00"));


        String filePath = "/home/optimus/UMSATZ.TXT";
        List<SAPTransaction> transactions = SAPMulticashTransactionParser.parseTransactionsFromFile(filePath);
        String balanceFilePath ="/home/optimus/Header AUSZUG.TXT";
        List<SAPBalance> balances = SAPMulticashBalanceParser.parseBalancesFromFile(balanceFilePath);
    }
}
