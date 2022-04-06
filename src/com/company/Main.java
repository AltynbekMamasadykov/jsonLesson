package com.company;

public class Main {

    public static void main(String[] args) {

        Car[] cars = {
                Car.makeCar("Honda Accord",6000,Type.SEDAN),
                Car.makeCar("Honda Civic",4000,Type.HATCHBACK),
                Car.makeCar("Honda TruckWagon",12000,Type.TRUCK)
        };

    }
}
