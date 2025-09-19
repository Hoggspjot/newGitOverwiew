package day190925;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int start = Math.min(one,two);
        int finish = Math.max(one,two);
        double number = 1;
        while (start <= finish) {
            number *= start;
            start++;
        }
        System.out.println(number);
    }
}
