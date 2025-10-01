package september.day300925;

import java.util.Scanner;

class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isGMailAddress(String email) {
        int first = email.indexOf("@");
        int last = email.lastIndexOf("@");
        String mailbox = email.substring(last+1);
        if (first == last && mailbox.equals("gmail.com") && first > 0) {
            return true;
        } else {
            return false;
        }
    }
}