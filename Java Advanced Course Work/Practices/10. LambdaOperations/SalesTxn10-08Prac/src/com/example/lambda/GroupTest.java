package com.example.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * 
 */
public class GroupTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Map<String, List<SalesTxn>> tMap;
        
        // Print out transactions grouped by Buyer
        System.out.println("=== Transactions Grouped by Buyer ===");
        tMap = tList.stream()
            .collect(Collectors.groupingBy(SalesTxn::getBuyerName));
        
        tMap.forEach((k,v) -> {
            System.out.println("\nBuyer: " + k);
            v.forEach(SalesTxn::printSummary);
        });
        
    }
}
