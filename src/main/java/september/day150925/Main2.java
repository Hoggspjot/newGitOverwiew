package september.day150925;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        int min = Integer.parseInt(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            if ( Integer.parseInt(strings[i]) < min) {
                min = Integer.parseInt(strings[i]);
            }
        }
        System.out.println(min);
    }
}
