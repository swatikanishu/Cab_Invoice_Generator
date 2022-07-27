package com.cabinvoicegenerator;

//      This class is used to hold data of multiple rides
public class InvoiceBill {

        private final int noOfRides;
        private final double totalFare;
        private final double avgFare;

        /**
         * parameterized constructor to bind the values for noOfRides, totalFare and avgFare
         *
         * @param noOfRides
         * @param totalFare
         */

    //      parameterized constructor to bind the values for noOfRides, totalFare and avgFare
    public InvoiceBill(int totalRides, double totalFare) {
        this.noOfRides= totalRides;
        this.totalFare = totalFare;
        this.avgFare = this.totalFare/this.noOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceBill that = (InvoiceBill) o;
        return noOfRides == that.noOfRides && Double.compare(that.totalFare, totalFare) == 0 && avgFare == that.avgFare;
    }
}


