package basic_chijein.src.Methods;

public class Syntax {
    public static void karan(){
        System.out.println(" We are Outside main function");
    }
    public static void main(String[] args) {//main function
        System.out.println("Karan");
        karan();//method call
        System.out.println("Shravan");
        trishul();
    }
    public static void trishul(){
        System.out.println(" We are insside trishul function");
    }
}

