package day300925;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        strings[0] = scanner.nextLine();
        strings[1] = scanner.nextLine();
        strings[2] = scanner.nextLine();

        Arrays.sort(strings);

        for (String x : strings) {
            System.out.println(x);
        }
    }
}
