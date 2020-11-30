package session04;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.setNationalCode(scanner.nextLine());
    }
}
