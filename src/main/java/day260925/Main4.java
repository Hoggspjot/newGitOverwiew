package day260925;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leng = scanner.nextInt();
        int mn = scanner.nextInt();

        Random random = new Random(mn);

        double[] array = new double[leng];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(0, 5);
            System.out.printf("%.2f ",array[i]);
            sum += array[i];
        }
        double sr = sum / array.length;
        System.out.println();
        System.out.printf("%.2f\n",sr);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > sr) {
                array[i] = sr;
            }
            System.out.printf("%.2f ",array[i]);
        }

    }
}
