package Arrays;

import java.util.Arrays;
import java.util.Vector;

public class AddingTwoArrays {
    public static void main(String[] args) {
        Vector<Integer> ans = new Vector<>();
        int [] a = {1,2,3};
        int [] b = {5,6,7};
        int n = a.length;
        int m = b.length;
        int maxlength = Math.max(a.length,b.length);
        int[] result = new int[maxlength];

        for(int i = 0; i<maxlength; i++){
            int val1 = (i<a.length) ? a[i]:0;
            int val2 = (i<b.length) ? b[i]:0;
            result[i]=val1+val2;
        }
        System.out.println(Arrays.toString(result));

        }


    }
