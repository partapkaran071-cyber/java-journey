package Arrays;

public class MissinginArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};  // array with missing number
        int n = arr.length + 1;    // total numbers including missing one
        int sum = n*(n+1)/2;       // sum of 1 to n
        int arraysum = 0;

        for(int x: arr){
            arraysum += x;
        }

        int missing = sum - arraysum;
        System.out.println("Missing number is: " + missing);
    }
}
