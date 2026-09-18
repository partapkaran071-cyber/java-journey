<<<<<<<< HEAD:src/basic_chijein/src/problems/problem04squareofanumber.java
package basic_chijein.src.problems;
========
package basic_chijein.Basicprogrammes;
>>>>>>>> lecture-files:src/basic_chijein/Basicprogrammes/problem04squareofanumber.java

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
