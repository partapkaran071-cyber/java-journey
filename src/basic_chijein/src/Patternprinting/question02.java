package Patternprinting;

import java.util.Scanner;

public class question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextByte();
        for(int i =1; i<=n; i++){
            for(int j =1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
