package september.day280925;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[scanner.nextInt()][scanner.nextInt()];
        Random random = new Random(scanner.nextInt());

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(-5, 5);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) {
                    count++;
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max+" "+ count);
    }
}
