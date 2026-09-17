package basic_chijein.src.ifelse;

import java.util.Scanner;

public class ternarybasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        //if (n%2==0) system.out.println("This is even");
        //else System.out.println("This is odd");

        // but we can use ternary operator here
        //condition ? sach : jhuth
        System.out.println((n%2==0) ? "Even": "odd");
    }
}