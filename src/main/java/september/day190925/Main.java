package september.day190925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int negative = 0;
        int num = 0;
        while (count < 10) {
            num = scanner.nextInt();
            if (num < 4) {
                negative++;
            }
            count++;
        }
        System.out.println(negative);

    }
}
