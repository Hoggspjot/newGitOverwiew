package september.day270925;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int rn = scanner.nextInt();

        int[] array = new int[len];
        Random random = new Random(rn);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 21);
        }

        System.out.println(Arrays.toString(array));

        int idx1 = scanner.nextInt();
        int idx2 = scanner.nextInt();

        Arrays.sort(array, idx1, idx2 + 1);
        System.out.println(Arrays.toString(array));
        scanner.close();
    }
}
