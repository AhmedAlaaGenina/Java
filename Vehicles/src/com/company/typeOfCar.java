package com.company;

public class typeOfCar extends Car {
    private int roadServiceMonth;

    public typeOfCar(int roadServiceMonth) {
        super("Toyata", 6, false, 4);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void rateSpeed(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        if (newSpeed == 0) {
            Stop();
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGears(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGears(2);
        } else if (newSpeed > 20 && newSpeed <= 30) {
            changeGears(3);
        } else {
            changeGears(4);
        }
        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
