package day220925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x <= 0 || y <= 0) {
            System.out.println("ERROR");
        } else {

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (i == 0 || (x - i == 1)) {
                        System.out.print("*");
                    } else {
                        if (j == 0 || (y - j == 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                }
                System.out.println();
            }
        }
    }
}
