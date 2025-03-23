import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writingvariables {
    public static void main(String[] args) throws IOException {
        int classcodes = 2454;
        double averageenrollment = 22.16;
        String classname = "Java";

        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("The class name is " + classname + "\n");
        bw.write("The class code is " + classcodes + "\n");
        bw.write("The average enrollment is "+ averageenrollment + " students.\n");
        bw.close();
        //writer.close() either one works
    }
}
