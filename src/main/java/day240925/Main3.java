package day240925;

import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            System.out.print(isPrime(number) + " ");
        }
    }

    static boolean isPrime(int x) {
        boolean flag = true;
        if (x <=1) {
            flag = false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}