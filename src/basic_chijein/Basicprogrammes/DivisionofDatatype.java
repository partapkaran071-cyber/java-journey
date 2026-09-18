package basic_chijein.Basicprogrammes;

import java.util.Scanner;

public class DivisionofDatatype {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       System.out.println("enter the principe");
       double p = sc.nextDouble();

       System.out.println("enter the rate");
       double r= sc.nextDouble();

       System.out.println("enter the time ");
       double t = sc.nextDouble();
       double si = p*r*t/100;
       System.out.println("smpleintrest is "+si);
    }
}