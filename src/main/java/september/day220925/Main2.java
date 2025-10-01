package september.day220925;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;
        if (x <= 0) {
            System.out.println("ERROR");
        } else {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print(" ");
                }
                for (int j = x - i; j > 0 ; j--) {
                System.out.print("*");
                }
                count++;
                System.out.println();
            }
        }
    }
}
