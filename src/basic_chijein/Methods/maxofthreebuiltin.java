package basic_chijein.Methods;

import java.util.Scanner;

public class maxofthreebuiltin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter c ");
        int c = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),(c)));

    }
}
