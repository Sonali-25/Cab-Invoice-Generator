package com.magic.cabinvoicegenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class cabInvoiceGeneratorTest {
    @Test
    public void calculateFareTest(){
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        double distance = 10;
        int time = 8;
        double Fare = invoice.calculateFare(distance,time);
        Assertions.assertEquals(108,Fare);
    }
}
