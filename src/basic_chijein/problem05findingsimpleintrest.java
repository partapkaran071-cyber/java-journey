package basic_chijein;

import java.util.Scanner;

public class problem05findingsimpleintrest {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the principle");
       double p = sc.nextDouble();
       System.out.println("Enter the rate");
       double r = sc.nextDouble();
       System.out.println("Enter the time");
       double t = sc.nextDouble();
       double si = (p*r*t)/100;
       System.out.println("the total simple intrest is "+si);
    }
}
