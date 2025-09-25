package day250925;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        String str = scanner.next();
        char sim = str.charAt(0);
        printTriangle(range, sim);
    }

    static void printTriangle(int range, char sim) {
        int numOfSim;
        int numOfProb;

        if (range % 2 == 0) {
            numOfSim = 2;
            numOfProb = range / 2;
        } else {
            numOfSim = 1;
            numOfProb = (range + 1) / 2;
        }

        for (int i = 1; i < range; i++) {
            if (numOfProb - i < 0) {
                break;
            }
            for (int j = 0; j < numOfProb - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numOfSim; j++) {
                System.out.print(sim);
            }
            numOfSim+=2;

            System.out.println();
        }
    }
}
