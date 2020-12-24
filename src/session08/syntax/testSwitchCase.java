package session08.syntax;

public class testSwitchCase {

    public static void main(String[] args) {
        String s = "A";
        switch (s){
            case "A":
                System.out.println("is A");
                break;
            case "B":
                System.out.println("is B");
                break;
            case "C":
                System.out.println("is C");
                break;
            case "D":
                System.out.println("is D");
                break;
            case "E":
                System.out.println("is E");
                break;
            default:
                System.out.println("Wrong Value");
        }

        int i = 70;
        switch (i){
            case 10:
                System.out.println("is 10");
                break;
            case 20:
                System.out.println("is 20");
                break;
            case 30:
                System.out.println("is 30");
                break;
            case 40:
                System.out.println("is 40");
                break;
            case 50:
                System.out.println("is 50");
                break;
            default:
                System.out.println("Wrong Value");
        }
    }
}
