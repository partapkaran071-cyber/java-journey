package basic_chijein.Methods;

import java.sql.SQLOutput;

public class Syntax {
    public static void karan(){
        System.out.println(" We are Outside main function");
    }
    public static void main(String[] args) {
        System.out.println("Karan");
        karan();//method call
        System.out.println("Shravan");
        karan();
    }
}
