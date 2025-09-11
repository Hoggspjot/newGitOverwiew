package day110925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();
        double num = Double.parseDouble(numStr);
        double result = Math.log(num + 7 * Math.sqrt(Math.pow(num, 4.0)+ Math.PI));
        System.out.printf("%.4f",result);
    }
}