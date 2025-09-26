package day260925;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int rand = scanner.nextInt();
        Random random = new Random(rand);
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-5, 6);
        }

        int sum = 0;
        double mn = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                sum += array[i];
            } else {
                mn *= array[i];
            }
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.print(sum + " ");
        System.out.print(mn);
    }
}