import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writearray {
    public static void main(String[] args) throws IOException {

        String[] months = {"Jan", "Feb", "Mar"};

        BufferedWriter bw = new BufferedWriter(new FileWriter("months.txt"));
        for (String month : months) {
            bw.write(month);
            bw.newLine();
        }
        bw.close();
    }
}
