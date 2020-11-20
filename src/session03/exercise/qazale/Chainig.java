package session03.exercise.qazale;

public class Chainig {

    public static void main(String[] args) {
        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.select("*").from("document").where("documentType=3;").print();
    }
}
