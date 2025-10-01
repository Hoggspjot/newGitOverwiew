package september.day090925;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int minutes = (time / 60) % 60;
        int hours = time / 3600 ;
        int sec = time % 60;
        System.out.printf("%d часов %d минут %d секунд",hours, minutes, sec);
    }
}
