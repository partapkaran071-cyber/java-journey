package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {5,-8,-10,-100,3,45};
        int n = arr.length;//length of array is 6
        System.out.println(arr.length);//to find total element of array
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
            System.out.println();
        }
        //input
        int [] karan = new int[7];
        System.out.println("Enter the elements");
        for(int i = 0; i<7; i++){
            karan[i]=sc.nextInt();
        }
        for(int i =0; i<7; i++){
            System.out.print(karan[i]+" ");
        }

    }
}
