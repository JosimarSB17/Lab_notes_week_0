package org.example;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {
        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);
        snowfall.put(stringInput("Enter a month here:"), positiveDoubleInput("Enter the amount of snow here:"));
        String newmonth = stringInput("Enter month here:");
        double newsnow = positiveDoubleInput("Enter the amount of snow here for " + newmonth );

        System.out.println(snowfall);

        if (snowfall.containsKey(newmonth)) {
            // asking to overwrite
            double newersnow = snowfall.get(newmonth);
            System.out.println("The hashmap already contains " + newmonth + "with " + newersnow + "inches of snow");
            boolean overwrite = yesNoInput("Overwrite the snow of " + newmonth);
            if (overwrite) {
                snowfall.put(newmonth, newsnow);
            }
            else {
                System.out.println("Data was not overwritten");
            }
        }
        else {
            snowfall.put(newmonth, newsnow);
        }

        System.out.println(snowfall);
        double total = 0;
        for (double snow : snowfall.values()) {
            total += snow;
        }
        System.out.println("The total snow is " + total);
        for (String month : snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.println("The snow in " + month + " was " + snow);
        }

        snowfall.put("February", 12.4);
        System.out.println(snowfall);

        System.out.println("the snow in Januray is " + snowfall.get("January") + " inches");
        System.out.println("the snow in July is " + snowfall.get("July") + " inches");
        if (snowfall.containsKey("July")) {
            System.out.println("there was snow in July");
        }
        else {
            System.out.println("there was no snow in July");
        }

    }
}
