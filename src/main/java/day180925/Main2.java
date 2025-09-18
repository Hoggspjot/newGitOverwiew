package day180925;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case  12, 1, 2 -> System.out.println("Winter");
            case  3,4, 5 -> System.out.println("Spring");
            case  6, 7, 8 -> System.out.println("Summer");
            case  9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("ERROR");
        }
    }
}
