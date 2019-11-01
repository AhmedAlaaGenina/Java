package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer =new Printer(9,30,10);
        System.out.println(printer.getTonerLevel());
        printer.fillUpTheToner();
       // System.out.println(printer.getTonerLevel());
        printer.print();
    }
}
