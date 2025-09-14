package day140925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num / 100_000 < 1 || num / 100_000 >= 10) {
            System.out.println("ERROR");
        } else {
            char[] chars = new char[6];
            for (int i = 0; i < chars.length; i++) {
                chars[i] = String.valueOf(num).charAt(i);
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < 3; i++) {
                sum1 += Integer.parseInt(String.valueOf(chars[i]));
                sum2 += Integer.parseInt(String.valueOf(chars[i + 3]));
            }
            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
