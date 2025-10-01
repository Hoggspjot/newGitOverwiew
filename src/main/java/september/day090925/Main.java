package september.day090925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rub = scanner.nextInt();
        int kop = scanner.nextInt();
        int reformRub = kop / 100;
        int kopOst = kop % 100;
        rub = rub + reformRub;
        System.out.printf("%d р. %d к.", rub, kopOst);
    }
}
