package session03.exercise.qazale;

public class QueryBuilder {
    String query;

    public QueryBuilder select(String star){
        this.query="select "+star;
                return this;
    }

    public QueryBuilder from(String table){
        this.query+=" from "+table;
        return this;
    }

    public QueryBuilder where(String condition){
        this.query+=" where "+condition;
        return this;
    }

    public void print(){
        System.out.println(this.query);
    }

}
