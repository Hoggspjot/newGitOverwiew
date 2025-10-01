package september.day300925;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str.trim();
        String[] strings = str.split(" +");
        int maxLength = 0;
        int index = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > maxLength) {
                maxLength = strings[i].length();
                index = i;
            }
        }
        System.out.println(strings[index]);
    }
}
