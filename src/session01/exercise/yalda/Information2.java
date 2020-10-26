package session01.exercise.yalda;

import java.util.Scanner;

public class Information2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name?");
        String name = scanner.next();


        System.out.print("Enter your last name?");
        String lastname = scanner.next();


        System.out.print("Please Enter our national code?");
        String nationalcode = scanner.next();


        System.out.print("Enter your age?");
        int age = scanner.nextInt();
        System.out.print("your name is " + name + " and your last name is " + lastname + "; you are "
                + age + " years old " + " , at the end your national code is " + nationalcode + ".");
    }
}
