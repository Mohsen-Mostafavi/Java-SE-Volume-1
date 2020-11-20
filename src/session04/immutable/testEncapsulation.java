package session04.immutable;

import java.util.Scanner;

public class testEncapsulation {


    public static void main(String[] args) {
        Student studen = new Student();
        studen.setNationalCode("1020304050");

        if (studen.getNationalCode().isEmpty()){
            System.out.println("Wrong Value");
        }else {
            System.out.println(studen.getNationalCode());
        }


        Student student = new Student();

        Scanner scanner = new Scanner(System.in);

        String nationalCode= scanner.nextLine();

        if (nationalCode.length()==studen.getMAX_CONT_NATIONALCODE()){
            studen.setNationalCode(nationalCode);
        }else {

        }
    }
}
