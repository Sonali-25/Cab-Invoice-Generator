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
    @Test
    public void multipleRidesTest(){
        CabInvoiceGenerator invoice = new CabInvoiceGenerator();
        Rides [] ride = {new Rides(2,3),new Rides(3,4),new Rides(4,5)};
        double Fare = invoice.multipleRidesFare(ride);
        Assertions.assertEquals(23+34+45,Fare);
    }
    @Test
    public void enhancedInvoiceTest()
    {
        Rides[] ride = {new Rides(2.0 , 3),
                new Rides(3.0, 4)} ;
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateMultipleRides(ride) ;
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 2*10+3+3*10+4) ;
        Assertions.assertEquals(expectedInvoiceSummary, invoiceSummary ) ;
    }
}
