package september.day290925;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
    }

    public static void initArray(int[][] array, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 11);
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] deleteRow(int[][] array, int ind) {
        if (ind < 0 || ind >= array.length) {
            return array;
        }

        int[][] arr2 = new int[array.length - 1][array[0].length];

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arr2[i][j] = array[i][j];
            }
        }
        for (int i = ind+1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arr2[i-1][j] = array[i][j];
            }
        }
        return arr2;
    }
}