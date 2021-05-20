package session13;

// run with -ea

class AssertTest {

    public static void main(String args[]) {

        for (int i=1; i < 10; i++) {

            //try {

                assert i < 5 : "i should be less than 5";

//            } catch(Error e) {
//
//                System.out.println("Assertion Failed! i is greater than 5");
//
//            }

            System.out.println("i is " + i);

        }

    }

}
