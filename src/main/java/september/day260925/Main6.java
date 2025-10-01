package september.day260925;

import java.util.Random;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int n = scanner.nextInt();

        int[] array = new int[len];
        Random random = new Random(n);

        int max = Integer.MIN_VALUE;
        int maxIdx = 0;
        int min = Integer.MAX_VALUE;
        int minIdx = 0;
        for (int i = 0; i <array.length ; i++) {
            array[i] = random.nextInt(-5, 16);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIdx = i;
            }
            if (array[i] < 0) {
                min = array[i];
                minIdx = i;
                if (minIdx < i) {
                    minIdx = i;
                }
            }
        }

        if (min < 0) {
            int temp = array[minIdx];
            array[minIdx] = array[maxIdx];
            array[maxIdx] = temp;
        }
        System.out.println();
        for (int x : array) {
            System.out.print(x+" ");
        }
    }
}
