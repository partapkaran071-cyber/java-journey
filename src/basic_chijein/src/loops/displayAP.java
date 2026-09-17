package basic_chijein.src.ifelse.Loops;

import java.util.Scanner;

public class displayAP {
   public static void main(String[] args) {
       //Display this AP + 2,5,8,11....upto n term
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number ");
       int n = sc.nextInt();
       for (int i = 2; i <= (3*n - 1); i+=3){
           System.out.print(i+" ");

       }
       System.out.println();
       //using loop without ap formula
       int a = 2, d = 3;
       for(int x = 1; x <= n; x++){
           System.out.print(a+" ");
           a+=d;
       }
    }
}
