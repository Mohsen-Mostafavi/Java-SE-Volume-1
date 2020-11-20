package session03.exercise.heshmat.ex1;

import java.util.Scanner;

public class TestQueryBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter select: ");
        String select = scanner.nextLine();
        System.out.print("please enter your table name: ");
        String tableName = scanner.nextLine();
        System.out.print("please enter yore where: ");
        String where = scanner.nextLine();
        System.out.println("------------------------");

        QueryBuilder query = new QueryBuilder();

        query.setSelect(select).setTableName(tableName).setWhere(where).print();

//        new QueryBuilder().setSelect(select).setTableName(tableName).setWhere(where).print();

    }

}
