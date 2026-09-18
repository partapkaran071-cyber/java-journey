package basic_chijein.src.Methods;

import java.util.Scanner;

public class PermutationandCombination {

    public static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();

        int ncr = fact(n) / (fact(r) * fact(n - r));  // Correct formula
        int npr = fact(n) / fact(n - r);              // Correct formula

        System.out.println("nCr = " + ncr);
        System.out.println("nPr = " + npr);
    }
}
