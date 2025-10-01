package september.day300925;

import java.util.Scanner;

class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }

    public static String delCom(String email) {
        int dot = email.lastIndexOf(".");
        String check = email.substring(dot);
        if (check.equals(".com")) {
            return email.substring(0, dot);
        } else {
            return email;
        }
    }
}