package september.day230925;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int start = Math.min(num1, num2);
        int finish = Math.max(num1, num2);

        int count = 0;
        boolean flag;

        for (int i = start; i <= finish ; i++) {
                flag = false;
                if (start == 1) {
                    flag = false;
                }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.print(i + " ");
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("NO");
        }
    }
}
