package org.example;


import java.io.*;

public class Hellowriting {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Hello.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello!\n");
        bw.write("More data here!\n");
        bw.write("Goodbye!\n");

        bw.close();

        FileWriter fw2 = new FileWriter("hello.txt", true);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        bw2.write("Other data!");
        bw2.newLine();
        bw2.write("Hello programmers!");
        bw2.newLine();
        bw2.write("End of file!");
        bw2.newLine();

        bw2.close();
        }
    }
