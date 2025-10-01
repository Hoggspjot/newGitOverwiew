package september.day300925;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] strings = text.split(" ");
        String correct = "";
        for (int i = 0; i < strings.length; i++) {
            correct += String.valueOf(strings[i].charAt(0)).toUpperCase() + strings[i].substring(1)+" ";
        }
        System.out.println(correct);
    }
}
