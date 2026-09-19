package ifelse;

import java.util.Scanner;

public class greatestof3no {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1st no.");
       int x = sc.nextInt();
       System.out.println("Enter 2nd no.");
       int y = sc.nextInt();
       System.out.println("Enter 3rd no.");
       int z = sc.nextInt();

       if(x>=y && x>=z)System.out.println("The greatest number is "+x);
       else if(y>=x && y>=z)System.out.println("The greatest number is "+y);
       if(z>=y && z>=x)System.out.println("The greatest number is "+z);

    }
}
