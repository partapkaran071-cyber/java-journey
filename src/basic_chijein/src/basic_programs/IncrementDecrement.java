package basic_chijein.src.basic_programs;

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

    public static class variables {
        public static void main(String[] args) {
            int x = 5;
            System.out.println(x);
            int y;//declaration
            y = 10;//initilization
            System.out.println(y);
            System.out.println(x+y);

            //modifying value of variables
            //we know the value we given to  x= 5;
            System.out.println(x);
            x = x + 7;
            System.out.println(x);
        }
    }

    public static class chardatatype {
        public static void main(String[] args) {
            // Direct character assignment
            char karan = 'A';
            System.out.println("Character: "+karan);

            // ASCII value of 'A' is 65
            int asciiValue = (int) karan; // type casting char → int
            System.out.println("ASCII value of 'A': " + asciiValue);

            // Another character
            char karanpratapsingh = 'B';
            System.out.println("Character: " + karanpratapsingh);
            System.out.println("ASCII value of 'B': " + (int) karanpratapsingh);

            // Example with digits
            char digit = '9';
            System.out.println("Character: " + digit);
            System.out.println("ASCII value of '9': " + (int) digit);


        }
    }
}