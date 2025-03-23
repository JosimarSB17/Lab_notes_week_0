import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Helloreading {
    public static void main(String[] args) throws IOException {

      //  FileReader fr = new FileReader("hello.txt");  any method works fine
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));

        String line; //= br.readLine();
        while ((line = br.readLine())!= null) {
            System.out.println(line);
            line = br.readLine();
        }

        br.close();
    }
}
