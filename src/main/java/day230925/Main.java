package day230925;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        BLOCK:
        while (i < 10) {
            do {
                for (int k = 0; k < 5; k++) {
                    sum += k;
                    if (sum > 25) break BLOCK;
                }
            } while (sum < 40);
            i++;
        }
        System.out.println("sum= " + sum); //на этот оператор передает управление break BLOCK;
    }
}