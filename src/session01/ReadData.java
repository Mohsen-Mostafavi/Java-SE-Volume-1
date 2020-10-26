package session01;

import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        System.out.print("What is your age? ");

        int age = sc.nextInt();


        System.out.println("You are " + age + " years old");

    }
}
