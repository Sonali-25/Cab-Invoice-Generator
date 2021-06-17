package com.magic.cabinvoicegenerator;

public class CabInvoiceGenerator {
    public static final int rate = 10;
    public static final int minimumFare = 5;
    public static double calculateFare(double distance, int time){
        double totalFare = distance*rate+time;
        if (totalFare < 5)
            return 5;
        else{
            return totalFare;
        }
    }
    public double multipleRidesFare(Rides [] ride){
        double totalFare = 0;
        for(Rides rides: ride){
            totalFare += calculateFare(rides.distance,rides.time);
        }
        return totalFare;
    }
    public static InvoiceSummary calculateMultipleRides(Rides[] ride) {
        double totalFare = 0;
        for (Rides rides : ride)
        {
            totalFare += calculateFare(rides.distance,rides.time);
        }
        return new InvoiceSummary(ride.length , totalFare);
    }
}
