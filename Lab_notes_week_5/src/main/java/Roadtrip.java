import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class Roadtrip {
    public static void main(String[] args) {
        Map<String , Integer> distances = new HashMap<>();
        distances.put("Duluth", 154);
        distances.put("Stillwater", 26);
        distances.put("Brainerd", 127);
        distances.put("Ely", 245);
        distances.put("Red Wing", 54);

        System.out.println(distances);

        int maxdriving = positiveIntInput("How far would you like to drive?");

        List<String> citiesinrange = new ArrayList<>();

        for (String city : distances.keySet()) {
            int distance = distances.get(city);
            if (distance <= maxdriving) {
                System.out.println(city + " is " + distance + " miles away");
                citiesinrange.add(city);
            }
        }

        if (citiesinrange.isEmpty()) {
            System.out.println("Sorry, but no cities found");
        }
        else {
            System.out.println("here are the cities you can drive to :" + citiesinrange.size());
            for (String city : citiesinrange) {
                System.out.println(city);
            }
        }
    }
}
