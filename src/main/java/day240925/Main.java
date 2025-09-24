package day240925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                int del = i;
                if (del % 2 == 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
