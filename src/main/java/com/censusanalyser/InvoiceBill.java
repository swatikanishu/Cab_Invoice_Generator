package com.censusanalyser;

import lombok.Setter;
import lombok.Getter;
public class InvoiceBill {
    @Setter
    @Getter
    int totalRides;
    double totalFare;
    int avgRide;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceBill that = (InvoiceBill) o;
        return totalRides == that.totalRides && Double.compare(that.totalFare, totalFare) == 0 && avgRide == that.avgRide;
    }

    public InvoiceBill(int totalRides, double totalFare, int avgRide) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.avgRide = avgRide;
    }

    @Override
    public String toString() {
        return "InvoiceBill{" +
                "totalRides=" + totalRides +
                ", totalFare=" + totalFare +
                ", avgRide=" + avgRide +
                '}';
    }
}

