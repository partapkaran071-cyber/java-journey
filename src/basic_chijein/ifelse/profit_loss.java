package basic_chijein.ifelse;

import java.util.Scanner;

public class profit_loss {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Cost Price");
       int cp = sc.nextInt();
       System.out.println("Enter the selling Price");
       int sp = sc.nextInt();
       sc.close();

       if(sp>cp) System.out.println("You have gained profit "+(sp-cp));
       else if(sp==cp)System.out.print("no prfit no loss"+(0));
       else System.out.println("You have loss on the item "+(cp-sp));


    }
}
