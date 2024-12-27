package com.pluralsight.rollout;

public class Decepticons extends Transformers {


    public Decepticons(String name, String vehicle) {
        super(name, vehicle);
    }

    @Override
    public String toString() {
        return String.format("Decepticons: Name: %-20s Vehicle: %-15s", getName(), getVehicle());
    }
}
