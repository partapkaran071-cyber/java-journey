package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintNegativeElementsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :  ");
        int n = sc.nextInt();
        int[] karan = new int[n];
        System.out.print("Enter array elements :");
        for(int i = 0; i<n; i++){
           karan[i]=sc.nextInt();
        }
        System.out.println("Negative elements are : ");
        for(int i = 0; i<n; i++){
            if(karan[i]<0)
            System.out.print(karan[i]+" ");
        }
    }
}
