package day300925;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        int[] indexes = new int[strings.length * 2];
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
                indexes[count] = strings[i].indexOf(";") + 1;
                indexes[count+1] = strings[i].lastIndexOf(";");
            count +=2;
        }

        String str = "";
        for (int i = 0; i < strings.length; i++) {
            str += strings[i].substring(indexes[i * 2], indexes[i * 2 + 1]);
        }
        System.out.println(str);
    }
}
