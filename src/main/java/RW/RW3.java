package RW;

import java.io.*;

public class RW3 {
    public static void main(String[] args) throws FileNotFoundException {

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("src/main/java/RW/input.txt")));
             BufferedWriter writer = new BufferedWriter(
                     new OutputStreamWriter(
                             new FileOutputStream("src/main/java/RW/output.txt")))
        ) {
            int count;
            char[] buffer = new char[1024];
            while ((count = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, count);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
