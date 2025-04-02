import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readnumfromfile {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = new ArrayList();
        String filename ="numbers.txt";
        FileWriter fw = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("67");
        bw.newLine();
        bw.write("65");
        bw.newLine();
        bw.write("84");
        bw.newLine();
        bw.write("cat");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        while (line != null) {
            // ignore anything that isn't an integer
            try {
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (NumberFormatException e) {
                // ignore
                System.out.println(line + " is not a number");
            }
            line = br.readLine();
        }
        System.out.println(numbers);

    }
}
