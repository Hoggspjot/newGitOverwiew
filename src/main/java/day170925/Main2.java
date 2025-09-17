package day170925;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи первое целое число");
        int first = scanner.nextInt();
        System.out.println("Введи арифметическую операцию");
        String znak = scanner.next();
        System.out.println("Введи второе целое число");
        int second = scanner.nextInt();
        boolean flag = true;
        int result = 0;
        switch (znak) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    System.out.println("ERROR");
                    flag = false;
                } else {
                    result = first / second;
                }
                break;
            case "%":
                if (second == 0) {
                    System.out.println("ERROR");
                    flag = false;
                } else {
                    result = first % second;
                }
                break;
            default:
                System.out.println("ERROR");
                flag = false;
        }
        if (flag) {
            System.out.println(result);
        }
    }
}
