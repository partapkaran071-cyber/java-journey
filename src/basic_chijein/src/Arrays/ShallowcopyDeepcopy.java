package Arrays;

import java.util.Arrays;

public class ShallowcopyDeepcopy {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        //shallow copy
        int [] x = arr;
        x[0]=10;
        System.out.println(arr[0]);
        // deep copy
        int [] y = Arrays.copyOf(arr,arr.length);
        y[0]=100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
