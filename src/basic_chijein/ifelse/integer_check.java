package basic_chijein.ifelse;

import java.util.Scanner;

public class integer_check {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x==0){
            System.out.println("It is  an integer");
        }else{
            System.out.println("Not an integer");
        }

    }
}
