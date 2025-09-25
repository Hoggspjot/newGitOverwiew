package day260925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();

        if (menu == 1) {
            double num = scanner.nextDouble();
            square(num);
        }
        if (menu == 2) {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            square(num1, num2);
        }

    }

    static void square(double num) {
        double pl = num * num;
        System.out.printf("%.2f",pl);
    }

    static void square(double num1, double num2) {
        double pl = num1 * num2;
        System.out.printf("%.2f",pl);

    }
}
