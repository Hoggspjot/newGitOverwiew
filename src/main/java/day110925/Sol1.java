package day110925;

import java.util.Scanner;
import static java.lang.Math.*;

public class Sol1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        double z = 2.0 * pow(sin(3 * PI - 2 * a),2) * pow(cos(5 * PI + 2 * a),2);
        double y = 0.25 - 0.25 * sin(2.5 * PI - 8 * a);

        System.out.printf("%.5f %.5f", z, y);

    }
}
