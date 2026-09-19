package Arrays;

public class ArraysBasics {
    public static void main(String[] args) {
        int[] x = {6,19,50,30,17,18,171};

        //indexing (1)
        System.out.println(x[5]);
        //updating elements - mutability
        x[3]=15;
        System.out.println(x[3]);

        int[] arr = new int[4]; // 4 size element from 0 to 3
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        arr[3]=13;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
