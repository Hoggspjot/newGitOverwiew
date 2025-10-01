package september.day200925;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        int num = scanner.nextInt();
        char lit = scanner.next().charAt(0);

        if (type == 1 && num >= 0) {
            for (int i = 0; i < num; i++) {
                System.out.println(lit);
            }
        } else if (type == 2 && num >= 0) {
            for (int i = 0; i < num; i++) {
                System.out.print(lit);
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
