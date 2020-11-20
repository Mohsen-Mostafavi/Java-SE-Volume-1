package session03.exercise.yalda.ex2;


import java.util.Scanner;

public class TestQueryBuilder {
    public static void main(String[] args) {
        QueryBuilder query = new QueryBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your select :");
        String selectInput = sc.nextLine();

        System.out.print("Find it from :");
        String fromInput = sc.nextLine();

        System.out.print("Located where :");
        String whereInput = sc.nextLine();

        query.setSelect(selectInput).setFrom(fromInput).setWhere(whereInput).print();

        query.setWhere(whereInput).setSelect(selectInput).setFrom(fromInput).print();
    }


}

