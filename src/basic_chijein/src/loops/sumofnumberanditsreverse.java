package loops;

import java.util.Scanner;

public class sumofnumberanditsreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("your number is "+n);

        int r = 0;
        int temp = n;
        while(n!=0){
            r*=10;
            r+=(n%10);
            n/=10;
        }
        int sum = temp+r;
        System.out.println("Your reverse of a number " + r);
        System.out.println("sum of number and its reverse is "+sum);

    }
}
