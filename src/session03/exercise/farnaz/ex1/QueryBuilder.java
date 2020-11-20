package session03.exercise.farnaz.ex1;

public class QueryBuilder {

    String branchName;
    String branch;
    String branchCode;

    public QueryBuilder setSelect(String name){
        branchName=name;
        return this;

    }

    public QueryBuilder setFrom(String name){
       branch=name;
        return this;

    }

    public QueryBuilder setWere(String name){
        branchCode=name;
        return  this;
    }

    public void print(){
        System.out.println("SELECT "+ branchName + " FROM " + branch + " WERE " + branchCode );
    }
}
