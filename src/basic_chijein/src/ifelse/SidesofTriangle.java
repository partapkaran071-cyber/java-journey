package ifelse;

import java.util.Scanner;

public class SidesofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side ");
        int side1 = sc.nextInt();
        System.out.println("enter second side ");
        int side2 = sc.nextInt();
        System.out.println("enter third  side ");
        int side3 = sc.nextInt();

        if((side1+side2)>side3 && (side2+side3)>side1 && (side1+side3)>side2){
            System.out.println("Valid traingle ");
        }else      System.out.println("inValid traingle ");
    }
}
