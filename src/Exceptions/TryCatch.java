package Exceptions;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {
        try {
            writeToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/Exceptions/myFile.txt"));
        bw.write("Test");
        bw.close();
    }
}
