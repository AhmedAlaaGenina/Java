package com.company;

public class Car extends Vehicle {
    private int gears;
    private boolean isManual;
    private int door;

    public Car(String name, int size, boolean isManual, int door) {
        super(name, size);
        this.gears = 1;
        this.isManual = isManual;
        this.door = door;
    }

    public void changeGears(int gears) {
        this.gears = gears;
        System.out.println("car.the current gears is " + this.gears);
    }

    public void changeSpeed(int speed, String direction) {
        System.out.println("Car.change Speed(): Speed " + speed +
                "the direction is " + direction);
        move(speed, direction);
    }

    @Override
    public void Stop() {
        super.Stop();
    }
}


