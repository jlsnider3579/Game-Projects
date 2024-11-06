package com.pluralsight.rollout;

public class Autobots extends Transformers {


    public Autobots(String name, String vehicle) {
        super(name, vehicle);

    }

    @Override
    public String toString() {
        return String.format("Autobot: Name: %-20s Vehicle: %-15s", getName(), getVehicle());
    }



    //add other methods or behaviors

}

