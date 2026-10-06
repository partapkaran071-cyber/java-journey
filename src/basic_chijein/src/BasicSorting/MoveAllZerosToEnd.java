package BasicSorting;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,0,7,0,5,0,4};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int swap = 0;
            for(int j = 0; j<n-1; j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }if(swap==0) break;
        }
         print(arr);
    }
    public static void print(int [] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
