import java.util.HashMap;
import java.util.Map;

public class Classcodes {
    public static void main(String[] args) {
        Map<Integer, String> classcodes = new HashMap<>();
        classcodes.put(2545, "Java");
        classcodes.put(1425, "Datacom");
        classcodes.put(2560, "Web");
        for (Integer key : classcodes.keySet()) {
            String classnames = classcodes.get(key);
            System.out.println("ITEC " + key + ": " + classnames);
        }
        System.out.println("I am taking " + classcodes.size() + " classes");
        int numofclasscodes = classcodes.size();


        int searchcode = 2417;

        if (classcodes.containsKey(numofclasscodes)) {
            System.out.println("The class is found in the hashmap, your code is " + classcodes.get(numofclasscodes));

        } else {
            System.out.println(searchcode + " is not found in the hashmap");
        }

        int searchcode2 = 2545;
        String classname = classcodes.get(searchcode2);
        if (classname == null) {
            System.out.println(searchcode2 + " is not found in the hashmap");
        }
        else{
            System.out.println(searchcode2 + " is found in the hashmap");
        }

    }
}
