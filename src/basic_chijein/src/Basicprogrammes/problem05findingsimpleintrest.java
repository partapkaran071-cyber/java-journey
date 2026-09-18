<<<<<<<< HEAD:src/basic_chijein/src/problems/problem05findingsimpleintrest.java
package basic_chijein.src.problems;
========
package basic_chijein.Basicprogrammes;
>>>>>>>> lecture-files:src/basic_chijein/Basicprogrammes/problem05findingsimpleintrest.java

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
