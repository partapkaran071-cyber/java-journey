package basic_chijein.src.Patternprinting;

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //print
        /* A
        * BB
        * CCC
        * DDDD*/
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {//hashes
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}
