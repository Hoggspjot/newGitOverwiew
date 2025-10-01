package september.day130925;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = abs(num);
        if ((num / 1000 >= 1) || (num / 100 < 1)) {
            System.out.println("ERROR");
        } else {
            int[] array = new int[3];
            array[0] = num / 100;
            array[1] = (num / 10) % 10;
            array[2] = num % 10;
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    sum += array[i];
                }
            }
            if (sum == 0) {
                System.out.println("NO");
            } else {
                System.out.println(sum);
            }
        }
    }
}
