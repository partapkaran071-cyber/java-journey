package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {34,56,23,12,16};
        int n = arr.length;
        int i =0, j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr) System.out.print(ele+" ");

        }

    }
