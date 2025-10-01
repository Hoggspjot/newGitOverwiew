package october.day011025;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        if (!str.matches(".*\\d.*")) {
            System.out.println("ERROR");
        } else {

            for (int i = 0; i < str.length(); i++) {
                String s = String.valueOf(str.charAt(i));
                if (s.matches("[0-9]")) {
                    sum += Integer.parseInt(s);
                    sb.append(s).append("+");
                }
                ;
            }
            System.out.println(sb.delete(sb.length() - 1, sb.length()).append("=").append(sum));
        }
    }
}
