package com.company;

public class Main {

    public static void main(String[] args) {
        Chair chair=new Chair("Wood");
        Bed bed =new Bed(2,"Steel");
        Table table =new Table(10,"wood",chair);
        Room room1=new Room(table,bed,chair);
//        Room room1 = new Room(new Table(10, "Wood",
//                new Chair("Wood")), new Bed(2, "Steel"),
//                new Chair("Wood"));

        room1.getIn();
        room1.getOut();
        room1.getTable().move();
        room1.getBed().sleep();
        room1.getChair().move();

    }
}
