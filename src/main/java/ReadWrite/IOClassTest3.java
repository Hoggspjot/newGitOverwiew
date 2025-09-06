package ReadWrite;

import java.io.*;

public class IOClassTest3 {
    public static void main(String[] args) {

        try(BufferedInputStream inputStream =
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/ReadWrite/source.txt"));
            BufferedOutputStream outputStream =
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/ReadWrite/destination.txt"))) {

            int count;
            byte[] buffer = new byte[1024];
            while ((count = inputStream.read(buffer)) != -1) {
              outputStream.write(buffer,0,count);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
