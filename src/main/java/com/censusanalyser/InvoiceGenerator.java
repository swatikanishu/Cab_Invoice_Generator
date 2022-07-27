package com.censusanalyser;
import java.util.LinkedList;
import java.util.List;

  //Creating InvoiceGenerator class for invoice generator for the given distance and time

public class InvoiceGenerator {
    private final int COST_PER_KM = 10;
    private final int COST_PER_MIN = 1;
    private final int MIN_FARE = 5;
    List<Ride> rides = new LinkedList<>();
    // Creating getFare to calculate the fare for the given distance and time
    public double getFare(double distance, int time) {
        double fare = distance * COST_PER_KM + time * COST_PER_MIN;
        if (fare < MIN_FARE) {
            return MIN_FARE;
        }
        return fare;
    }
// add ride
    public void addRide(double distance, int time) {
        Ride ride = new Ride(distance, time);
        rides.add(ride);
    }
   // calculate total fare
    public double totalFare() {
        double totalFare = 0;
        for (Ride ride : rides)
            totalFare += this.getFare(ride.getDistance(), ride.getTime());
        return totalFare;
    }
}

