package Arrays;

import java.util.Vector;

public class AddingArraysDigitWise {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {6,7,8,9};
        Vector<Integer> ans = new Vector<>();
        int i = a.length-1;
        int j = b.length-1;
        int carry = 0;

        while (i>=0 || j>=0 || carry>0){
            int val1 = (i>=0)?a[i]:0;
            int val2 = (j>=0)?b[j]:0;
            int sum = val1+val2+carry;
            ans.add(0,sum%10);
            carry = sum/10;
            i--;
            j--;

        }
        System.out.println(ans);
    }
}
