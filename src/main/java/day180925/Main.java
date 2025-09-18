package day180925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variant = scanner.nextInt();
        int salary;
        int numOfLate;
        int numCode;

        switch (variant) {
            case 1:
                salary = scanner.nextInt();
                numOfLate = scanner.nextInt();
                System.out.println(first(salary, numOfLate));
                break;
            case 2:
                numCode = scanner.nextInt();
                numOfLate = scanner.nextInt();
                int result = second(numCode, numOfLate);
                if (result == 0) {
                    System.out.println("ERROR");
                } else {
                    System.out.println(result);
                }
                break;
            case 3:
                numCode = scanner.nextInt();
                numOfLate = scanner.nextInt();
                System.out.println(third(numCode,numOfLate));
                break;
            default:
                System.out.println("ERROR");
        }
    }


    public static int first(int salary, int numOfLate) {
        int fine = numOfLate / 3;
        int code = (salary + (fine * 20)) / 50;
        if ((salary + (fine * 20)) % 50 != 0) {
            code += 1;
        }
        return ((code) * 100);
    }

    public static int second( int numCode , int salary) {
        int factSalary = (numCode / 100) * 50;
        if (factSalary < salary) {
            return 0;
        } else {
            int sum = factSalary - salary;
            int ost = ((sum / 20) * 3) + 2;
            return ost;
        }
    }

    public static int third(int numCode, int numOfLate) {
        int factSalary = (numCode / 100) * 50;
        int fine = (numOfLate / 3) * 20;
        if (factSalary - fine <= 0) {
            return 0;
        }else
            return factSalary - fine;
    }

}
