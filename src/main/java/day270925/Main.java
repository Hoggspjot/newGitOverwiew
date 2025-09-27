package day270925;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int rn = scanner.nextInt();
        int elem = scanner.nextInt();
        Random random = new Random(rn);
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2, 16);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int elIdx = Arrays.binarySearch(array, elem);
        if (elIdx < 0) {
            System.out.println("ERROR");
        } else {
            int[] copyArr = Arrays.copyOfRange(array, 0, elIdx + 1);

            System.out.println(Arrays.toString(copyArr));
        }
    }
}
