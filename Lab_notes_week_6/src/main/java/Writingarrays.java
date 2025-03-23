import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Writingarrays {
    public static void main(String[] args) throws IOException {
        final String filename = "ITEC_Classes.txt";
        List<String> classnames = List.of("Java", "Web", "C#");

        // List<String> classes = new Arraylist<>();
        // classes.add("Java")
        // classes.add("Web")
        // classes.add("C#")

        List<Integer> classcodes = List.of(2545, 2560, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < classnames.size(); i++) {
            String classname = classnames.get(i);
            int classcode = classcodes.get(i);
            bufferedWriter.write("ITEC " +  classcode + " " + classname + "\n");
        }
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        List<String> classdesc = new ArrayList<>();

        String line = bufferedReader.readLine();
        while (line != null) {
            classdesc.add(line);
            line = bufferedReader.readLine();
        }
        System.out.println("End of file");
        System.out.println(classdesc);
    }
}
