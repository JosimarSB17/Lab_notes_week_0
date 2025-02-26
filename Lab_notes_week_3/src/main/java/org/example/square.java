package org.example;

import static input.InputUtils.doubleInput;

public class square {
    public static void main(String[] args) {
        double number = doubleInput("enter a number and i'll square it: ");
        double squared = square(number);
        System.out.println(number + "squared is " + squared);
    }

    public static double square(double number) {
        double area = number * number;
        return area;
    }
}
