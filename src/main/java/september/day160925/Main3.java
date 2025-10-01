package september.day160925;

import java.util.Scanner;

public class Main3 {
    private static int TANK = 300;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int AB = scanner.nextInt();
        int BC = scanner.nextInt();
        int load = scanner.nextInt();

        if (load > 2000) {
            System.out.println("ERROR");
        } else {
            int cost = 0;
            if (load <= 500) {
                cost = 1;
            } else if (load > 500 && load <= 1000) {
                cost = 4;
            } else if (load > 1000 && load <= 1500) {
                cost = 7;
            } else if (load > 1500 && load <= 2000) {
                cost = 9;
            }
            double needFuel = 0.0;
            if ((AB * cost) > TANK || (BC * cost) > TANK) {
                System.out.println("ERROR");
            } else if (((AB + BC)*cost) <= TANK) {
                System.out.printf("%.2f",needFuel);
            } else {
                needFuel = Math.abs((TANK - (AB * cost)) - (BC * cost));
                System.out.printf("%.2f", needFuel);
            }
        }
    }
}



