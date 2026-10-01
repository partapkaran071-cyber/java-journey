package Arrays;

public class MergeThreeArrays {

    public static void main(String[] args) {

        int[] a = {1, 8, 9};
        int[] b = {2, 3, 4, 5};
        int[] c = {6, 7};

        int[] d = new int[a.length + b.length + c.length];

        merge(d, a, b, c);

        for (int ele : d) {
            System.out.print(ele + " ");
        }
    }

    private static void merge(int[] d, int[] a, int[] b, int[] c) {

        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;

        while (l < d.length) {

            int x = Integer.MAX_VALUE;
            int y = Integer.MAX_VALUE;
            int z = Integer.MAX_VALUE;

            if (i < a.length) {
                x = a[i];
            }

            if (j < b.length) {
                y = b[j];
            }

            if (k < c.length) {
                z = c[k];
            }

            if (x <= y && x <= z) {
                d[l++] = x;
                i++;
            }
            else if (y <= x && y <= z) {
                d[l++] = y;
                j++;
            }
            else {
                d[l++] = z;
                k++;
            }
        }
    }
}