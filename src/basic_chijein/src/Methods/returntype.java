package basic_chijein.src.Methods;

public class returntype {
    public static void main(String[] args) {
        int x = prasun(10);
        System.out.println(x+5);

    }
    public static int prasun(int a){
        System.out.println("karan");

        if(a>0) return 5;
        else return 10;//return type is integer
    }
}
