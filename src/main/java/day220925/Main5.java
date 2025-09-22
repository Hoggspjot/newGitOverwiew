package day220925;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int start = Math.min(x, y);
        int finish = Math.max(x, y);

        int max = Integer.MIN_VALUE;
        int maxNum = 0;
        for (int i = start; i <= finish; i++) {
            int sum = 0;
            int num = Math.abs(i);
            do {
              int numbers = num % 10;
              sum += numbers;
              num = num /10;
            } while (num > 0);
            if (sum > max) {
                max = sum;
                maxNum = i;
            }
        }
        System.out.println(maxNum);
    }
}
