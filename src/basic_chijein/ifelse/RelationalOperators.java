package basic_chijein.ifelse;

public class RelationalOperators {
    public static void main(String[] args) {

        System.out.println(5>3);//greater than
        System.out.println(3<5);//less than
        System.out.println(5!=3);//not equal to
        System.out.println(5>=3);//greater than equal to
        System.out.println(3<=5);//less than equal to
        System.out.println(5==5);//equal to

        // wrong operation give false output
        System.out.println(9==10);
        System.out.println(5!=5);
        System.out.println(9<=2);


        //** boolean data type store only true or false
        boolean x = (5>3);
        System.out.println(x);

    }
}
