package september.day170925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();

        switch (month) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                System.out.println("Зима");
                break;
                case "март":
                 case "Апрель":
                 case "Май":
                System.out.println("Весна");
                break;
                 case "Июнь":
                 case "Июль":
                 case "Август":
                System.out.println("Лето");
                break;
                 case "Сентябрь":
                 case "Октябрь":
                 case "Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
