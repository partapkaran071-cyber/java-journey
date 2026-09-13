package basic_chijein.ifelse;

import java.util.Scanner;

public class OddEven {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number :-");
       int n = sc.nextInt();

        if (n%2==0) {
            System.out.println("This is an even number");
        }
        else {
            System.out.println("this is an odd number ");
        }
    }
}
