package basic_chijein.src.Patternprinting;

import java.util.Scanner;

public class question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //i+Jmax= n+1
            // Jmax = n+1-i
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}