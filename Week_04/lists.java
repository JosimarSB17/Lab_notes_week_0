package Week_04;

import java.util.ArrayList;
import java.util.List;

public class lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Josimar");
        arrayList.add("MCTC");

        for (String s: arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }
        System.out.println(arrayList);
    }
}
