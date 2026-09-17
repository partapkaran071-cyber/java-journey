package basic_chijein.src.Patternprinting;

import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter n: ");
                int n = sc.nextInt();

                int nsp = 2 * (n - 1);
                int nst = 1;

                // Upper half
                for (int i = 1; i <= n; i++) {

                    // Left stars
                    for (int j = 1; j <= nst; j++) {
                        System.out.print("*");
                    }

                    // Spaces
                    for (int j = 1; j <= nsp; j++) {
                        System.out.print(" ");
                    }

                    // Right stars
                    for (int j = 1; j <= nst; j++) {
                        System.out.print("*");
                    }

                    System.out.println();

                    nst++;
                    nsp -= 2;
                }

                // Lower half
                nst = n - 1;
                nsp = 2;

                for (int i = 1; i < n; i++) {

                    // Left stars
                    for (int j = 1; j <= nst; j++) {
                        System.out.print("*");
                    }

                    // Spaces
                    for (int j = 1; j <= nsp; j++) {
                        System.out.print(" ");
                    }

                    // Right stars
                    for (int j = 1; j <= nst; j++) {
                        System.out.print("*");
                    }

                    System.out.println();

                    nst--;
                    nsp += 2;
                }
            }
        }

