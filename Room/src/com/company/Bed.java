package com.company;

public class Bed {
    private int cover;
    private String whatMade;

    public Bed(int cover, String whatMade) {
        this.cover = cover;
        this.whatMade = whatMade;
    }

    public void sleep() {
        System.out.println("Some One Sleep ON Bed!");
    }

    public int getCover() {
        return cover;
    }

    public String getWhatMade() {
        return whatMade;
    }
}
