package session01.exercise;

import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is your name?");
        String name=scanner.next();


        System.out.println("what is your last name?");
        String lastname=scanner.next();


        System.out.println("what is your nationalcode?");
        String nationalcode=scanner.next();


        System.out.println("what is your year?");
        int year =scanner.nextInt();

        System.out.println("what is your month?");
        int month =scanner.nextInt();

        System.out.println("what is your day?");
        int day =scanner.nextInt();

        System.out.println("your name is "+ name +" your lastname is "+ lastname  + "nationalcode is"+ nationalcode + "your birth day is" +year +  "/"+month + "/"+ day );

    }
}
