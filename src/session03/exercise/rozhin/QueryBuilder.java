package session03.exercise.rozhin;

public class QueryBuilder {
    String s;
    String coloumnName;
    String tableName;
    String conditions;


    public QueryBuilder select(String s){
        this.s="SELECT "+s;
        return this;
    }

    public QueryBuilder from(String s) {
        this.s += " FROM "+s;
        return this;
    }

    public QueryBuilder where (String s) {
        this.s += " WHERE "+s;
        return this;
    }

    public void print () {
    System.out.println(this.s+";");
    }

}
