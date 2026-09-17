package basic_chijein.src.problems;

import java.util.Scanner;

public class problem01areaofCircle {
    public static void main(String[] args) {
        //area of circle = pi^r*r (ye comment hai)
        Scanner sc = new Scanner(System.in);//use to take input
        System.out.println("Enter the radius");
        double r = sc.nextDouble();//input from user
        double area = 3.141592 * r * r;
        System.out.println("area of circle " +area);

    }
}
