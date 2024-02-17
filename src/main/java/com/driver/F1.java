package com.driver;

public class F1 extends Car {
    // Constructor
    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "Sports", 1);
        // For parameters not mentioned, they will be initialized in the Car constructor
    }

    // Additional method
    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate;

        if(newSpeed <= 0) {
            stop();
        } else {
            int newGear = 1;
            if(newSpeed >= 1 && newSpeed <= 50)
                newGear = 1;
            else if(newSpeed >= 51 && newSpeed <= 100)
                newGear = 2;
            else if(newSpeed >= 101 && newSpeed <= 150)
                newGear = 3;
            else if(newSpeed >= 151 && newSpeed <= 200)
                newGear = 4;
            else if(newSpeed >= 201 && newSpeed <= 250)
                newGear = 5;
            else
                newGear = 6;

            changeGear(newGear);
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
