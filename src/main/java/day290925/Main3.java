package day290925;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }
    public static void init(int[] array, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(-3, 6);
            }
        }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            }
            System.out.println();
        }

    public static int findMax(int[] array) {
            int max = Integer.MIN_VALUE;
            int maxIdx= 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxIdx = j;
                }
            }
            return maxIdx;
        }

    public static int[] reduceAfterMax(int[] array) {
        int maxIdx = findMax(array) + 1;
        int[] arr2 = new int[maxIdx];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = array[i];
        }
        return arr2;
    }
}

