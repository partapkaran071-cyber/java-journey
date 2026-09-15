package basic_chijein.Loops;

import java.util.Scanner;

public class printingallfactorofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextByte();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
                if (i != n / i) {
                    System.out.print(n / i+" ");
                }
            }
        }
    }
}
