package september.day280925;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] array = new int[x][y];
        Random random = new Random(scanner.nextInt());

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(-10, 11);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array[x - 1].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] > 0) {
                    sum += array[j][i];
                }
            }
            System.out.print(sum + " ");
        }
    }
}
