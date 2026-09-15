package basic_chijein.Loops;

import java.util.Scanner;

public class araisestopowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        System.out.println("Enter the power of a number");
        int b = sc.nextInt();
        int pow =1;
        for(int i =1;i<=b;i++){
            pow*=a;
        }
        System.out.println(a+ " raised to the power "  +b+ " is " +pow);

    }
}
