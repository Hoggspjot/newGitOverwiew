package september.day250925;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }

    static int simpleInRange(int a, int b) {
        int start = Math.min(a, b);
        int finish = Math.max(a, b);
        int count = 0;
        boolean flag = true;


        for (int i = start; i <= finish; i++) {
            if(i <= 1) continue;
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;

    }
}