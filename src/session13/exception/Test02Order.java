package session13.exception;

public class Test02Order {

    public static void main(String[] args) {

        System.out.println("1");

        try {
            System.out.println("2");
            Class c = Class.forName("NotExists");
            System.out.println("3");
        } catch(ClassNotFoundException e) {
            System.out.println("4");
        }

        System.out.println("5");


    }

}


// Normal:    1,2,3,5
// Exception: 1,2,4,5
