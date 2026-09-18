package basic_chijein.src.Methods;

public class Maximumof3number {
    public static void main(String[] args) {
        max(12,-8,16);

    }
    public static void max(int a , int b , int c){
        if(a>=b && a>=c) System.out.println("Maximum number is "+a);
        else if(b>=a && b>=c) System.out.println("Maximum number is "+b);
        else System.out.println("Maximum number is "+c);
    }
}
