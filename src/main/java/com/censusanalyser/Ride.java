package com.censusanalyser;

public class Ride {
    double distance;
    int time;
    //to accept multiple rides
    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }



    public int getTime() {
        return time;
    }





    @Override
    public String toString() {
        return "Ride{" +
                "distance=" + distance +
                ", time=" + time +
                '}';
    }
}

