package Methods;

public class Functioncall {
    public static void main(String[] args) {
        //function call
        Sahil();
        Yashika();
        Madan();

    }
    public static void Sahil(){
        System.out.println("Karan");
        Yashika();//function can also call another function
    }
    public static void Yashika(){
        System.out.println("Kritika");
        Madan();
    }
    public static void Madan(){
        System.out.println("Kunal");
    }

}
