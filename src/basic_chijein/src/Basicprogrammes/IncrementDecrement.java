package basic_chijein.src.Basicprogrammes;

public class IncrementDecrement {
    public static void main(String[] args) {

        int x = 10;

        System.out.println(++x); // 11 (prefix increments first)
        System.out.println(x++); // 11 (postfix returns old value, then x=12)
        System.out.println(x);   // 12

        int y = 5;
        System.out.println(--y); // 4 (prefix decrements first)
        System.out.println(y--); // 4 (postfix returns old value, then y=3)
        System.out.println(y);   // 3
    }
}