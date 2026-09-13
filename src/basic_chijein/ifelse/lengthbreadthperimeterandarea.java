package basic_chijein.ifelse;

import java.util.Scanner;

public class lengthbreadthperimeterandarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();

        int area = length * breadth;
        System.out.println("the area is "+area);

        int perimeter = 2*(length + breadth);
        System.out.println("the perimeter is "+perimeter);

        if(area>perimeter)
            System.out.println("the Area is greater than its perimeter ");
        else
            System.out.println("The area is less than its perimeter ");



    }
}
