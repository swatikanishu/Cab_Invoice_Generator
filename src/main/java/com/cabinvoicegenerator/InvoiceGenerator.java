package com.cabinvoicegenerator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class InvoiceGenerator {
    private final int COST_PER_KM = 10;
    private final int COST_PER_MIN = 1;
    private final int MIN_FARE = 5;
    List<Ride> rides = new LinkedList<>();

    public double getFare(double distance, int time) {
        double fare = distance * COST_PER_KM + time * COST_PER_MIN;
        if (fare < MIN_FARE) {
            return MIN_FARE;
        }
        return fare;
    }

    public void addRide(double distance, int time) {
        Ride ride = new Ride(distance, time);
        rides.add(ride);
    }

    public double totalFare() {
        double totalFare = 0;
        for (Ride ride : rides)
            totalFare += this.getFare(ride.getDistance(), ride.getTime());
        return totalFare;
    }
    public InvoiceBill getInvoiceBill() {
        int totalRides = rides.size();
        double totalFare = this.totalFare();
        int avgRide = (int) totalFare / totalRides;
        return new InvoiceBill(totalRides, totalFare, avgRide);
    }
}