package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumofElementsofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size  : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements ");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Sum of all the arrays are : ");
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum+=arr[i];
        }
        System.out.print(sum);

    }
}
