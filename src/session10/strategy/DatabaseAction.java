package session10.strategy;

public class DatabaseAction {

    private Sort sort;

    void insert(){
        sort.sorting();
    }

    void delete(){
        sort.sorting();
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
