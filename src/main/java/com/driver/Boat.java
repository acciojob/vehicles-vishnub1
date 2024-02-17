package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    // Constructor
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Implementing methods from WaterVehicle interface
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
