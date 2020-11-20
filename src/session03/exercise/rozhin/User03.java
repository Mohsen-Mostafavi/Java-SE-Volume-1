package session03.exercise.rozhin;



import java.util.Scanner;

public class User03 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        QueryBuilder u1 = new QueryBuilder();
        System.out.println("Column?");
        u1.s = scaner.nextLine();

        QueryBuilder u2= new QueryBuilder();
        System.out.println("Table?");
        u2.s = scaner.nextLine();

        QueryBuilder u3 = new QueryBuilder();
        System.out.println("Conditions?");
        u3.s = scaner.nextLine();

        u1.select(u1.s).from(u2.s).where(u3.s).print();




    }
}
