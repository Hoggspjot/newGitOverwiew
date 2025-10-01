package september.day300925;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.replaceAll(";", ".,");

        System.out.println(str);
    }
}
