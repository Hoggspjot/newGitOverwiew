package september.day250925;

import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }

    static int maxNumberDivider(int a, int b) {

        int countMax = 0;
        int max = 0;

        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > countMax) {
                max = i;
                countMax = count;
            }
        }
        return max;
    }
}