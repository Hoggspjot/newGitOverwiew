package day240925;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int finish = scanner.nextInt();

        int sum = 0;

        for (int i = start; i <= finish ; i++) {
            for (int j = 2; j <= i ; j++) {
                if (i % j == 0) {
                    sum += j;
                    break;
                }
            }
        }
        System.out.println(sum);

    }
}
