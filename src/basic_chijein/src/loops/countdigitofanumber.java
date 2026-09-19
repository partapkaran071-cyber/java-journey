package loops;

import java.util.Scanner;

public class countdigitofanumber {
   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number : ");
       int n = sc.nextInt();
       if(n==0)n=1;
       int count = 0;
       while(n!=0){
           n/=10;
           count ++;
       }
       System.out.println("Total digit: "+count);

    }
}