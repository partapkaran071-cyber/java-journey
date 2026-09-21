package Arrays;

import java.util.Arrays;

import static java.lang.IO.print;
public class SortArrayBuiltin {
    public static void main(String[] args) {
//sort-ascending order

        int[] arr = {4, 1, 7, 6, 8, 5, -1, 19};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}

