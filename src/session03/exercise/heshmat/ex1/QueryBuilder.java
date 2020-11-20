package session03.exercise.heshmat.ex1;

public class QueryBuilder {
    String select;
    String tableName;
    String where;

    public QueryBuilder setSelect(String select){
        this.select = select;
        return this;
    }

    public QueryBuilder setTableName(String tableName){
        this.tableName = tableName;
        return this;
    }
    public QueryBuilder setWhere(String where){
        this.where=where;
        return this;
    }
    public void print(){
        System.out.println("select " +select+ " from " +tableName+" where " + where );
    }
}
