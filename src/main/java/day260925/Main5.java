package day260925;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kol = scanner.nextInt();
        int[] array = new int[kol];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        int minIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                if (minIdx < i) {
                    minIdx = i;
                }
            }
        }
        array[minIdx] = -1;

        for (int x : array) {
            System.out.print(x +" ");
        }

    }
}
