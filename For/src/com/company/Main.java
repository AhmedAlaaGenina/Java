package com.company;

public class Main {

    public static void main(String[] args) {
//        for (double i = 2; i < 9; i++) {
//            System.out.println("in rate = " + i + " calc = "
//                    + String.format("%.2f", calc(10000, i)));
//        }
//        for (double i = 8; i > 1; i--) {
//            System.out.println("in rate = " + i + " calc = "
//                    + String.format("%.2f", calc(10000, i)));
//        }

        for (int i=0;i<=7;i++){
            if (isPrime(i)){
                System.out.println( i + " is prime number");
            }
            if (i==3){
                break;
            }
        }
  }

//    public static double calc(double amount, double rate) {
//        return (amount * (rate / 100));
//    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;

        }
        for (int i = 2; i <= (long) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
