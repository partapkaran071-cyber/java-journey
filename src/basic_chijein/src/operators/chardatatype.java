package operators;

public class chardatatype {
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

