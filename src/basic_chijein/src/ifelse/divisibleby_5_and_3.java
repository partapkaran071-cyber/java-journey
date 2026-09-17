package basic_chijein.src.ifelse;

import java.util.Scanner;

public class divisibleby_5_and_3 {
  public   static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number ");
      int n = sc.nextInt();

      if(n%5==0 || n%3==0){
          System.out.println("the number is divisible by 5 or 3");
      }else
          System.out.println("The number is not divisible by 5 or 3 ");

    }
}
