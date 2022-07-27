package com.cabinvoicegenerator;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class InvoiceGenerator {
    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MIN = 1;
    private static final int MIN_FARE = 5;
    List<Ride> rides = new LinkedList<>();

    public static double getFare(double distance, int time) {
        double fare = distance * COST_PER_KM + time * COST_PER_MIN;
        if (fare < MIN_FARE) {
            return MIN_FARE;
        }
        return fare;
    }

    public static InvoiceBill getFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += getFare(ride.getDistance(), ride.getTime());
        }
        return new InvoiceBill(rides.length, totalFare);
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

}
