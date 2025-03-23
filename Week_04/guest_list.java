package Week_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;

public class guest_list {
    public static void main(String[] args) {
        List<String> guests = new ArrayList<>();

        while (true) {
            String name = stringInput("Enter the name of the guest: ");
            if (name.isEmpty()) {
                break;
            }

            if (ignorecase(guests, name)) {
                System.out.println(name + " is already in the list");
            }
            else {
                System.out.println(name + " added");
                guests.add(name);
            }
        }
        Collections.sort(guests);
        print(guests);

        while (yesNoInput("Do you want to remove the guest from the list?")) {
            System.out.println("here are the guests: ");
            System.out.println(guests);
            if (guests.isEmpty()) {
                System.out.println("There are no guests in the list");
                break;
            }
            int num = positiveIntInput("Please enter the guests number you would like to remove: ");
            num--;
            if (num < guests.size()) {
                String remove = guests.remove(num);
                System.out.println(remove + " removed from the list");
            }
            else {
                System.out.println("Please enter the guests number you would like to remove: ");
            }
        }
        print(guests);

        System.out.println("the number of guests is " + guests.size());

        prizewinner(guests);
    }
public static void print(List<String> guests) {
        if (guests.isEmpty()) {
            System.out.println("There are no guests");
        }
        else {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i + 1) + ": " + guests.get(i));
            }
        }
}
public static boolean ignorecase(List<String> list, String name) {
        for (String s : list) {
            if (s.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
public static void prizewinner(List<String> guests) {

        if (guests.isEmpty()) {
            System.out.println("There are no guests");
            return;
        }
        Random rnd = new Random();
        int ranguest = rnd.nextInt(guests.size());
        String winner = guests.get(ranguest);
        System.out.println("guest number " + (ranguest + 1) + " " + winner + " wins a prize");
}
}
