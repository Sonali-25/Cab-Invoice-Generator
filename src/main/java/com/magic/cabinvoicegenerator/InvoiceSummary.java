package com.magic.cabinvoicegenerator;

public class InvoiceSummary {
    private final double totalFare;
    private final int numberOfRides;
    private final double averageFare;

    public InvoiceSummary(double totalFare,int numberOfRides) {
        this.totalFare = totalFare;
        this.numberOfRides = numberOfRides;
        this.averageFare = this.totalFare/this.numberOfRides;
    }

}
