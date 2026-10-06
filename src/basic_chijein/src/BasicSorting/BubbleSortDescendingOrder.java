package BasicSorting;

public class BubbleSortDescendingOrder {
    public static void main(String[] args) {
        int [] arr = {-2,9,3,7,12,6,4,8};
        int n = arr.length;
        print(arr);
        System.out.println();
        for(int i = 0; i<n-1; i++){
            int swap = 0;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
        print(arr);

    }
    public static void print(int [] arr){
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}
