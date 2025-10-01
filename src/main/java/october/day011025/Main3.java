package october.day011025;

import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String str = primer(a, b);
        System.out.println(str);
    }


    public static String primer(int a, int b) {
        StringBuilder sb = new StringBuilder();
        return sb.append(a).append(" + ").append(b).append(" = ").append(a + b).toString();
    }
}