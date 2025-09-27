package day270925;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int rn = scanner.nextInt();

        Random random = new Random(rn);
        double[] array = new double[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(0, 2);
        }

        System.out.println(Arrays.toString(array));

        double min = array[0];
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(min + max);
    }
}
