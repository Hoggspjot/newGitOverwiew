package september.day200925;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(scanner.nextInt());
        int count = 0;
        int sum = 0;
        do {
            count++;
            int x = number % 10;
            sum += x;
            number = number / 10;
        } while (number > 0);
        System.out.println(count+" "+sum);
    }
}
