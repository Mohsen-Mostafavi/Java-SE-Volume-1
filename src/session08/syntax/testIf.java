package session08.syntax;

public class testIf {
    public static void main(String[] args) {

        int i = 10;
        int j = 20;

        String s1 = "ABC";
        String s2 = "DEF";
//        if (false)
//            System.out.println("true");
//        System.out.println("Is not this in if block");

//        if (false){
//            System.out.println("true");
//            System.out.println("Is this in if block");
//        }

//        if (true)
//            System.out.println("true");
//        else
//            System.out.println("false");
//        System.out.println("B");

//        if (s1.equals(s2)) {
//            System.out.println("true");
//            System.out.println("A");
//        }
//        else {
//            System.out.println("false");
//            System.out.println("B");
//        }

        if (i != j){
            System.out.println("A");
        }
        if (s1.equals(s2)){
            System.out.println("B");
        }

        if (i != j){
            System.out.println("A");
        }
        else if (!s1.equals(s2)){
            System.out.println("B");
        }

    }
}
