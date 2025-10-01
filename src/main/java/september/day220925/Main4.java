package september.day220925;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <=k ; j++) {
                System.out.print(i * j+"\t");
            }
            System.out.println();
        }
    }
}
