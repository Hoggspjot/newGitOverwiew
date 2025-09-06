package ReadWrite;


import java.io.*;

public class IOClassTest {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("src/main/java/ReadWrite/source.txt");
        FileOutputStream outputStream = new FileOutputStream("src/main/java/ReadWrite/destination.txt");
        while (inputStream.available() > 0) {
            int inf = inputStream.read();
            outputStream.write(inf);
        }
        inputStream.close();
        outputStream.close();
    }
}
