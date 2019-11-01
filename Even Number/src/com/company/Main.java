package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isEven = isEvenNumber(0);
        System.out.println(isEven);
    }

    public static boolean isEvenNumber(int num) {
        while (num % 2 != 0) {
            return false;
        }
        return true;
    }
}
