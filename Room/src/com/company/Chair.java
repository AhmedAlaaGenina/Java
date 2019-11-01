package com.company;

public class Chair {
    private String whatMade;


    public String getWhatMade() {
        return whatMade;
    }

    public void move() {
        System.out.println("The Chair is Moving! ");
    }

    public Chair(String whatMade) {
        this.whatMade = whatMade;

    }
}
