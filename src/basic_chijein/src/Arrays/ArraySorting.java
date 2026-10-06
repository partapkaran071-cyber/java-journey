package Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = true;
                break;
            }
        }
        if (sorted) {
            System.out.println("it is sorted");
        } else {
            System.out.println("it is not sorted");
        }
    }
}
