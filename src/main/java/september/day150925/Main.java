package september.day150925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        int first = 0;
        int second = 0;
        for (int i = 0; i < 2; i++) {
            first += Integer.parseInt (strings[i]);
        }
        double firstD = first / 2.;
        System.out.println(firstD);
        for (int i = 2; i < 6; i++) {
            second += Integer.parseInt(strings[i]);
        }
        double secondD = second / 4.;
        System.out.println(secondD);
        if (firstD > secondD) {
            System.out.println("First");
        } else if (firstD < secondD) {
            System.out.println("Second");
        } else {
            System.out.println("Draw");
        }
    }
}
