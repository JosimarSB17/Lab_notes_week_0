package org.example;

import static input.InputUtils.stringInput;

public class Hellomethods {
    public static void main(String[] args) {
        String name = stringInput("Enter your name: ");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }// end of method

    public static String makeGreeting(String name) {
        String greeting = "Hello " + name + "!";
        return greeting; // return or output
    }// end of method

}//end of code
