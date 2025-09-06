package ReadWrite;

import java.io.*;

public class IOClassTest2 {
    public static void main(String[] args) throws IOException {

        try (FileInputStream inputStream = new FileInputStream("src/main/java/ReadWrite/source.txt");
        FileOutputStream outputStream = new FileOutputStream("src/main/java/ReadWrite/destination.txt")) {

            int count;
            byte[] buffer = new byte[1024];
            while (inputStream.available() > 0) {
                count = inputStream.read(buffer);
                outputStream.write(buffer, 0 ,count);
            }
        }
    }
}
