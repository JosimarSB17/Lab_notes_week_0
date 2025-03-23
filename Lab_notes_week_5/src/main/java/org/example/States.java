package org.example;

import java.util.HashMap;
import java.util.Map;


public class States {
    public static void main(String[] args) {

        HashMap<String, String> states = new HashMap<>();
        states.put("Minnesota", "MN");
        states.put("Wisconsin", "WI");
        states.put("Michigan", "MI");
        states.put("Iowa", "IA");
        System.out.println(states);

        System.out.println(states.get("Minnesota"));
        System.out.println(states.get("Iowa"));

        String wisconsin = states.get("Wisconsin");
        System.out.println(wisconsin);

        for (String name : states.keySet()) {
            System.out.println(name);
            System.out.println(states.get(name));
        }
        for (String abbreviations : states.values()) {
            System.out.println(abbreviations);
        }

        String searchabbreviation = "MI";
        for (String name : states.keySet()) {
            System.out.println(name);
            String abbreviations = (states.get(name));
            if (abbreviations.contains(searchabbreviation)) {
                System.out.println("Found abbreviation: " + name + ", " +abbreviations);
            }

        }

        Map<String, String> abbreviationsstate = new HashMap<>();
        for (Map.Entry<String, String> entry : states.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationsstate.put(state, abbreviation);
        }
        System.out.println(abbreviationsstate);
        System.out.println("there are " + states.size() + " states in the hashmap");
    }
    }
