package day300925;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String word = scanner.nextLine();
        text.trim();
        String[] strings = text.split(" +");
        String correctTxt = "";
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals(word)) {
                correctTxt += strings[i]+" ";
            }
        }
        System.out.println(correctTxt);
    }
}
