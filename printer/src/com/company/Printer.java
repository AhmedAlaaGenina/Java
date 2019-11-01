package com.company;

public class Printer {
    int tonerLevel = 100;
    int pagesPrinted;
    int duplexPrinter;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getDuplexPrinter() {
        return duplexPrinter;
    }

    public Printer(int tonerLevel, int pagesPrinted, int duplexPrinter) {
        if (tonerLevel > 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpTheToner() {
        if (tonerLevel <=10) {
            this.tonerLevel = 100;
            System.out.println("your fill it" + tonerLevel);
        }
    }

    public void print() {
        System.out.println("Paper printed");
    }
}
