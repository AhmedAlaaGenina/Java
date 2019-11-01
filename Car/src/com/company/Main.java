package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public void startEngine() {
        System.out.println("StartEngine().Car");
    }

    public void accelerate() {
        System.out.println("Accelerate().Car");
    }

    public void brake() {
        System.out.println("brake().Car");
    }
}

class Toktok extends Car {
    public Toktok(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("startEngine().Toktok");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate().toktok");
    }

    @Override
    public void brake() {
        System.out.println("brake().toktok");
    }
}

class moto extends Car {
    @Override
    public void startEngine() {
        System.out.println("startEngine().moto");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate().moto");
    }

    @Override
    public void brake() {
        System.out.println("brake().moto");
    }

    public moto(int cylinders, String name) {
        super(cylinders, name);
    }
}

class verna extends Car{
    @Override
    public void startEngine() {
        System.out.println("startEngine().verna");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate().verna");
    }

    @Override
    public void brake() {
        System.out.println("brake().verna");
    }

    public verna(int cylinders, String name) {
        super(cylinders, name);
    }
}

public class Main {

    public static void main(String[] args) {
        Car car= new Car(8,"Base");
        car.accelerate();
        car.brake();
        car.startEngine();
    }
}
