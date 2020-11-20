package session03.exercise.farnaz.ex1;

import java.util.Scanner;

public class ReadQueryBuilder {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter your select: ");
        String inputSelect = scanner.nextLine();


        System.out.print("please enter your from: ");
        String inputFrom = scanner.nextLine();


        System.out.print("please enter your were: ");
        String inputWere = scanner.nextLine();

        QueryBuilder tast =new QueryBuilder();
        tast.setSelect(inputSelect).setFrom(inputFrom).setWere(inputWere).print();


    }
}
