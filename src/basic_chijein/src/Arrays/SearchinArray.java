package Arrays;

public class SearchinArray {
    public static void main(String[] args) {
        int[] arr = {12, 20, 40, 34, 20, 60};
        int target = 12;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target found at index " + i);
                found = true;
                break; // stops after first match
            }
        }

        if (!found) {
            System.out.println("Target not found in array");
        }
    }
}
