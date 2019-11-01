package com.company;

public class Vehicle {
    private String name;
    private int size;
    private int currentSpeed;
    private String currentDirection;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.currentSpeed = 0;
        this.currentDirection = "";
    }

    public void move(int speed, String direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Vehicle.Move(): the Speed of Vehicle is " + currentSpeed +
                " and it's Direction is " + currentDirection);
    }

    public void Stop() {
        this.currentSpeed = 0;
        System.out.println("Move(): the Speed of Vehicle is " + currentSpeed);
    }

}
