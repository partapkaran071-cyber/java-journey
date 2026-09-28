package Arrays;

import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
         int[][] marks = new int [3][3];
         Scanner sc = new Scanner(System.in);
        for(int row = 0; row<3; row++){
            for(int col = 0; col<3; col++) {
                System.out.print("Enter marks ["+row+"]["+col+"]:");
               marks [row][col]=sc.nextInt();
            }
            }

         for(int row = 0; row<3; row++){
             for(int col = 0; col<3; col++){
                 System.out.print(marks[row][col]+" ");
             }
             System.out.println();
         }
    }
}
