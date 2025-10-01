package september.day100925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mon = scanner.nextLine();
        int discount = scanner.nextInt();

        String[] money = mon.split(" ");
        int rub = Integer.parseInt(money[0]);
        int kop = Integer.parseInt(money[1]);
        double moneyKop =Math.ceil(((rub * 100) + kop) * (1.0 - (discount * 0.01)));
        int rubDiscount =(int) moneyKop/100;
        int kopDiscount = (int) moneyKop % 100;
        System.out.printf("%02d руб. %02d коп.", rubDiscount, kopDiscount);
    }
}
