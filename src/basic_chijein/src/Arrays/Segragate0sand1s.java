package Arrays;

public class Segragate0sand1s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1, 0, 0};
        int numberofZeros = 0;
        for (int ele : arr) {
            if (ele == 0) numberofZeros++;

        }
        for (int i = 0; i < numberofZeros; i++) {
            arr[i] = 0;
        }
        for (int i = numberofZeros; i < arr.length; i++) {
            arr[i] = 1;
        }
        System.out.print("Segregated arrays are : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}

