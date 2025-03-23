import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingnumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(Integer.toString(data1) + "\n");
        bufferedWriter.write(data2 + "\n");
        bufferedWriter.write(data3 + "\n"); // int number arguments
        bufferedWriter.write(number + "\n");
        bufferedWriter.write("Test"); // writing strings
        bufferedWriter.close();
    }
}
