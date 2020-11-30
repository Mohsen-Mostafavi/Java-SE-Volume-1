package session04.str;

import java.util.Scanner;

public class Intern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1= new String("MOHSEN");

        String str2 = "MOHSEN";

        String str3 = str1.intern();

        System.out.println("please entere MOHSEN");

        String str4 = scanner.nextLine();

        System.out.println(str1==str2);

        System.out.println(str2==str3);

        System.out.println(str1==str3);

        System.out.println(str4==str3);

    }
}
