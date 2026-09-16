package basic_chijein.Patternprinting;

import java.util.Scanner;

public class question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //printthe pattern
        /* 1
        * A B
        * 1 2 3
        * A B C D
        * 1 2 3 4 5  */
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
        if(i%2!=0){//odd rows-> number
            for(int j = 1; j<=i; j++){
                System.out.print(j +" ");
            }
        }else{
            for(int j =1; j<=i; j++){
                System.out.print((char)(j+64)+" ");
            }
        }
            System.out.println();
        }
    }
}
