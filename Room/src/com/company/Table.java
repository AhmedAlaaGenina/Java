package com.company;

public class Table {
    private int thingsOn;
    private String whatMade;
    private Chair chair;

    public Table(int thingsOn, String whatMade, Chair chair) {
        this.thingsOn = thingsOn;
        this.whatMade = whatMade;
        this.chair = chair;
    }

    public void move() {
        System.out.println("table move ");
    }

    public int getThingsOn() {
        return thingsOn;
    }

    public String getWhatMade() {
        return whatMade;
    }

    public Chair getChair() {
        return chair;
    }
}
