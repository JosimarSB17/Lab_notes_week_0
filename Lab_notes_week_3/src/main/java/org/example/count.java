package org.example;

import static input.InputUtils.intInput;

public class count {
    public static void main(String[] args) {
        //print a list of numbers in order
        int smallnumber = intInput("enter a small number ");
        int largenumber = intInput("enter a large number ");
        System.out.println("i will count from " + smallnumber + " to " + largenumber);
        count(smallnumber, largenumber);
    }
    // method that doesn't return anything
    public static void count(int small, int big) {
        for (int i = small; i <= big; i++) {
            System.out.println(i);
        }
    }
}
