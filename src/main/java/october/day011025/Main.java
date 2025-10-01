package october.day011025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str.trim();
        String[] strings = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains("z")) {
                strings[i] = "ERROR";
                sb.append(" ").append(strings[i]);
            } else if (i == 0) {
                sb.append(strings[i]);
            } else {
                sb.append(" ").append(strings[i]);
            }
        }
        System.out.println(sb);
    }
}
