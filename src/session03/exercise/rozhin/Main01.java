package session03.exercise.rozhin;


public class Main01 {
    public static void main(String[] args) {

        QueryBuilder queryBuilder= new QueryBuilder();
        queryBuilder.select("*").from("Cm_Goods").where("ID=1;").print();


    }
}
