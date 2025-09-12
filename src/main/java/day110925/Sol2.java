package day110925;

import java.util.Scanner;

import static java.lang.Math.*;

public class Sol2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println(x+" "+y);
        System.out.println(x2+" "+y2);

        double first = sqrt(pow(x, 2) + pow(y, 2));
        double second = sqrt(pow(x2, 2) + pow(y2, 2));

        System.out.println(first);
        System.out.println(second);

        if (first < second) {
            System.out.println("Первая точка ближе");
        } else if (first > second) {
            System.out.println("Вторая точка ближе");
        } else {
            System.out.println("Точки на равных расстояниях");
        }
    }
}
