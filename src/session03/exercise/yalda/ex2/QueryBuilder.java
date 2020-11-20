package session03.exercise.yalda.ex2;

public class QueryBuilder {
    private String select;
    private String from;
    private String where;

    public QueryBuilder setSelect(String select) {
        this.select = select;
        return this;

    }

    public QueryBuilder setFrom(String from) {
        this.from = from;
        return this;

    }

    public QueryBuilder setWhere(String where) {
        this.where = where;
        return this;

    }

    public void print() {
        System.out.print("SELECT " + select + " FROM " + from + " WHERE " + where);
    }


}