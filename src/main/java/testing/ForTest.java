package testing;


import java.io.IOException;
import java.util.Random;

public class ForTest {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int x = random.nextInt(10);
        System.out.println(x);
        int y = random.nextInt(10);
        System.out.println(y);
        System.out.println(plus(x,y));
    }

    public static int plus(int x, int y) {
        return x + y;
    }
}
