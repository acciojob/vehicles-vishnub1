package com.driver;

public class F1 extends Car {
    private boolean isManual;

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, true, "race", 1);
        this.isManual = isManual;
    }

    // Getters for F1 class
    @Override
    public String getName() {
        return super.getName();
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return super.getCurrentGear();
    }

    // Other methods
    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed <= 0) {
            stop(); // Stop the car, set gear as 1
        } else if (newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
