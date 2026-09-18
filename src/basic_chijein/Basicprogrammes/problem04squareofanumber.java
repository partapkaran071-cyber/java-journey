package basic_chijein.Basicprogrammes;

import java.util.Scanner;

public class problem04squareofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int value = sc.nextInt();
        int Square = value*value;
        System.out.println("the square of a number is "+Square);

    }
}
