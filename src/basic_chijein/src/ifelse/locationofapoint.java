package ifelse;

import java.util.Scanner;

public class locationofapoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();

        if (x == 0 && y == 0)
            System.out.println("This point at origin");
        else if(x==0)
            System.out.println("This lies on y axis");

        else if(y==0)
            System.out.println("This lies on x axis");

        else if (x > 0 && y > 0)
            System.out.println("This lies on first Quadrant");
        else if (x < 0 && y > 0)
            System.out.println("This lies on second Quadrant");
        else if (x < 0 && y < 0)
            System.out.println("This lies on third Quadrant");
        else
            System.out.println("This lies fourth Quadrant");

    }

}
