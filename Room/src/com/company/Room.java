package com.company;

public class Room {
    private Table table;
    private Bed bed;
    private Chair chair;

    public Room(Table table, Bed bed, Chair chair) {
        this.table = table;
        this.bed = bed;
        this.chair = chair;
    }

    public Table getTable() {
        return table;
    }

    public Bed getBed() {
        return bed;
    }

    public Chair getChair() {
        return chair;
    }

    public void getIn() {
        System.out.println("SomeOne GetIn Room");
    }

    public void getOut() {
        System.out.println("SomeOne GetOut Room");
    }
}
