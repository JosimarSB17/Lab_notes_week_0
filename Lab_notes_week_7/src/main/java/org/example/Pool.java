package org.example;

public class Pool {

    private String name; // field, or variable
    private double length; // another field

    // instance method
    // instance is another word for an object
    // an instance of a class
    // a pool object is an instance if the pools class


    public Pool(String name, double length){
        this.name = name;
        this.length = length;
    }

    public double distanceforlaps(int laps){
        // 10 laps of pool length 50 = 500 meters
        double total = laps * this.length;
        return total;
    }

    @Override
    public String toString(){
        String description = this.name + " pool is " + length + " meters long";
        return description;
    }

}