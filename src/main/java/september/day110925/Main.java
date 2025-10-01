package september.day110925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String numStr = scanner.nextLine();
//        double num = Double.parseDouble(numStr);
        //прикол с локалью

     /*   етод Scanner.nextDouble() использует локаль по умолчанию вашей системы.
        В большинстве стран с английским языком разделителем дробной части является
        точка (.). Однако во многих других странах (например, в России, Германии, Франции)
        для этого используется запятая (,).*/
        //то есть если ввести 3.45 InputMismatchException а если 3,45 то норм

        double num = scanner.nextDouble();
        double result = Math.log(num + 7 * Math.sqrt(Math.pow(num, 4.0)+ Math.PI));
        System.out.printf("%.4f",result);
    }
}