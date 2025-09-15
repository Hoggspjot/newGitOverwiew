package day150925;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        double pay = scanner.nextDouble();
        double money;
        if (hours < 0 || pay < 0) {
            System.out.println("ERROR");
        } else {

            if (hours <= 20) {
                money = hours * pay;
                System.out.printf("%.2f", money);
            } else if (hours > 20 && hours <= 40) {
                double firstPart = 20 * pay;
                double secondPart = (hours - 20) * (pay * 1.5);
                System.out.printf("%.2f", (firstPart + secondPart));
            } else {
                double firstPart = 20 * pay;
                System.out.println(firstPart);
                double secondPart = (hours -(hours - 20)) * (pay * 1.5);
                System.out.println(secondPart);
                double threePart = (hours - 40) * (pay * 2.0);
                System.out.println(threePart);
                System.out.printf("%.2f", (firstPart + secondPart + threePart));
            }


        }
    }
}

