package september.day200925;

import java.util.Scanner;

public class Main3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int max = num1 > num2 ? num1 : num2;

        for (int i = 1; i <= max; i++) {
            if ((num1 % i == 0) & (num2 % i == 0)) {
                System.out.print(i+" ");
            }
        }
    }
}
