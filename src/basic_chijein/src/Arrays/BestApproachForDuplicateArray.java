package Arrays;

public class BestApproachForDuplicateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 4};
        int max = a.length;
        int sum =0;
        for(int i = 0; i<a.length; i++){
            sum+=a[i];
        }
       int n = a.length-1;
        int expectedsum = n*(n+1)/2;
        int answer = sum - expectedsum;
        System.out.println(answer);


    }
}
  