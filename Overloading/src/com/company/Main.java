package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInechToCentemeter()
    }

    public static double calcFeetAndInechToCentemeter(double feet, double inches) {
        if ((feet >= 0) || (inches >= 0 && inches <= 12)) {
            return -1;
        }

        double centimeterOfFeet = feet * 30.48;
        System.out.println(centimeterOfFeet);
        double centimeterOfInches = inches * 2.54;
        System.out.println(centimeterOfInches);


    }

    public static double calcFeetAndInechToCentemeter(double inches) {
        if (inches >= 0) {
            double feetOfInches = inches / 12;
            return feetOfInches;
        } else {
            return -1;
        }
    }
}
