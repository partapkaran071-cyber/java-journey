package Arrays;

public class Question01 {
    public static void main(String[] args) {
        // Multiply odd indexed elements by 2 and add 10 to even indexed elements
        int [] arr = {10,20,30,40,50};
        for (int i = 0; i<arr.length; i++){
            if(i%2==0) arr[i]*=2;
            else arr[i]+=10;
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
