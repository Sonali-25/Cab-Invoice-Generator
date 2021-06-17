package com.magic.cabinvoicegenerator;

public class InvoiceSummary {
    private final double totalFare;
    private final double numberOfRides;
    private final double averageFare;

    public InvoiceSummary(double numberOfRides,double totalFare) {
        this.totalFare = totalFare;
        this.numberOfRides = numberOfRides;
        this.averageFare = this.totalFare/this.numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.numberOfRides, numberOfRides) == 0 &&
                Double.compare(that.averageFare, averageFare) == 0;
    }
}
