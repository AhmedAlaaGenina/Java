package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] notSortedArray = getIntegers(7);
        printArray(notSortedArray);
        int[] sortedArray = sortArray(notSortedArray);
        System.out.println("sorted Array is ");
        printArray(sortedArray);

    }

    public static int[] getIntegers(int arrayLength) {
        System.out.println("Please,Enter " + arrayLength + " Numbers Of Array \r");
        int[] values = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter the Number " + (1 + i) + "\n");
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The Element Number " + (i + 1) + " =" + array[i]);
        }
    }

    public static int[] sortArray(int[] arr) {
        int temp;
        int[] array = Arrays.copyOf(arr,arr.length);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = arr[i];
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;

    }
}
