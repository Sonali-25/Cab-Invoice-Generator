package com.magic.cabinvoicegenerator;

public class CabInvoiceGenerator {
    public static final int rate = 10;
    public static final int minimumFare = 5;
    public double calculateFare(double distance, int time){
        double totalFare = distance*rate+time;
        if (totalFare < 5)
            return 5;
        else{
            return totalFare;
        }
    }
}
