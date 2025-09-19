package day190925;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kol = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int number;
        for (int i = 0; i < kol; i++) {
            number = scanner.nextInt();
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}
