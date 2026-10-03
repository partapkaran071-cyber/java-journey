package Arrays;

public class NewApproachforDuplicatingArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 2};
        int n=a.length;
        boolean[] flag = new boolean[n+1];
        for(int i = 0; i<n; i++){
            int ele = a[i];
            if(flag[ele]==true) System.out.println(ele);
            else flag[ele]=true;
        }
    }
}
