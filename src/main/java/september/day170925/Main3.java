package september.day170925;


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "понедельник":
                System.out.println("Monday");
                break;
            case "вторник":
                System.out.println("Tuesday");
                break;
            case "среда":
                System.out.println("Wednesday");
                break;
            case "четверг":
                System.out.println("Thursday");
                break;
            case "пятница":
                System.out.println("Friday");
                break;
            case "суббота":
                System.out.println("Saturday");
                break;
            case "воскресенье":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}