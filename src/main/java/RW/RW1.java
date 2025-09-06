package RW;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class RW1 {
    public static void main(String[] args) throws FileNotFoundException {
        try (Reader reader = new InputStreamReader(
                new FileInputStream("src/main/java/RW/input.txt"), StandardCharsets.UTF_8)) {
            int buffer;
            while ((buffer = reader.read()) != -1) {
                char code = (char) buffer;
                System.out.print(code);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
