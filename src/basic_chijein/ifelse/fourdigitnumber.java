package basic_chijein.ifelse;

import java.util.Scanner;

public class fourdigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n>999 && n<10000)
            System.out.print("It is 4 digit number");
        else System.out.print("Not a 4 digit no.");

    }
}
