package basic_chijein.src.ifelse;

import java.util.Scanner;

public class magnitudelessthan69 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n<=69 && n>=-69){
            System.out.println("The magnitude is less than or equal to 69");
        }else
            System.out.println("The magnitude is not less than or equal to 69 ");


    }
}
