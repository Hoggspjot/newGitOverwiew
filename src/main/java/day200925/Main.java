package day200925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num;
        int control = scanner.nextInt();
        do {
            num = scanner.nextInt();
            if(num < 0) break;
            if (control % num == 0) {
                count++;
            }
        } while (num >= 0);
        System.out.println(count);
    }
}
