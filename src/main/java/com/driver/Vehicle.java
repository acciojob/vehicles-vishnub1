package com.driver;

//Vehicle: name, currentSpeed, currentDirection
//
//constructor: given the name of the vehicle, initialize speed and direction as 0.
//move(speed, direction): set the current speed and direction
//steer(direction): Add direction to the currentDirection
//stop(): Stop the car by setting current speed to 0
public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = "Auid";
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        direction = currentDirection;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        speed = currentSpeed;
        direction = currentDirection;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
