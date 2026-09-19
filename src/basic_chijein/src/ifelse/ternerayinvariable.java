package ifelse;

import java.util.Scanner;

public class ternerayinvariable {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value");
       int n = sc.nextInt();

        int karan = (n>=0) ? 100 : 0;
        System.out.println(karan);
    }
}
