package com.pluralsight.rollout;

public class Transformers {

    //fields or variables hold data within an object
    protected String name;
    protected String vehicle;


    public Transformers(String name, String vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getVehicle() {
        return vehicle;
    }


    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
