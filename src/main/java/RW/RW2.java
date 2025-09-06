package RW;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class RW2 {
    public static void main(String[] args) throws FileNotFoundException {
        try (Reader reader = new InputStreamReader(
                new FileInputStream("src/main/java/RW/input.txt"), StandardCharsets.UTF_8);
             Writer writer = new OutputStreamWriter(
                     new FileOutputStream("src/main/java/RW/output.txt"), Charset.forName("Cp1251"))
        ) {
            int count;
            char[] buffer = new char[1024];
            while ((count = reader.read(buffer)) != -1) {
                writer.write(buffer,0, count);

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
