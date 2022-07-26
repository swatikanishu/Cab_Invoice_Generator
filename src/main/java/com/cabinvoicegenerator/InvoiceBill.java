package com.cabinvoicegenerator;

//      This class is used to hold data of multiple rides
public class InvoiceBill {

    int totalRides;
    double totalFare;
    int avgRide;

    //      parameterized constructor to bind the values for noOfRides, totalFare and avgFare
    public InvoiceBill(int totalRides, double totalFare, int avgRide) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.avgRide = avgRide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceBill that = (InvoiceBill) o;
        return totalRides == that.totalRides && Double.compare(that.totalFare, totalFare) == 0 && avgRide == that.avgRide;
    }
}


