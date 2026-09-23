package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {30,87,14,43,21,89,45,36,23,17,87};
        int d = 3;
        int n = arr.length;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        for(int x:arr){
            System.out.print(x+" ");
        }

    }
    public static void reverse(int[]arr,int i , int j ){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}

