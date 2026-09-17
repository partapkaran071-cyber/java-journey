package basic_chijein.src.ifelse.Loops;

import java.util.Scanner;

public class GPquestion {
   public  static void main(String[] args) {
       //DIsplay the GP 1,2,4,8,16.........upto n terms taking input from user
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n : ");
       int n = sc.nextByte();
       int a = 1 , r = 2;
       for(int i = 1; i <= n; i++) {
           System.out.print(a+ " ");
           a *=r;
       }



    }
}
