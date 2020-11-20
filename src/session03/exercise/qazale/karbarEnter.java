package session03.exercise.qazale;

import java.util.Scanner;

public class karbarEnter {

    public static void main(String[] args) {
        QueryBuilder queryBuilder = new QueryBuilder();
        Scanner scanner = new Scanner(System.in);

        QueryBuilder queryBuilder1 = new QueryBuilder();
        System.out.println("select?");
        queryBuilder1.query = scanner.nextLine();

        QueryBuilder queryBuilder2 = new QueryBuilder();
        System.out.println("from?");
        queryBuilder2.query = scanner.nextLine();

        QueryBuilder queryBuilder3 = new QueryBuilder();
        System.out.println("where?");
        queryBuilder3.query = scanner.nextLine();
        queryBuilder.select(queryBuilder1.query).from(queryBuilder2.query).where(queryBuilder3.query).print();


//        QueryBuilder queryBuilder = new QueryBuilder();
//        Scanner scanner = new Scanner(System.in);
//        queryBuilder.select(scanner.nextLine()).from(scanner.nextLine()).where(scanner.nextLine()).print();


    }
}
