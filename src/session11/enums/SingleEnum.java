package session11.enums;

public enum SingleEnum { // Like Singleton Class

    INSTANCE;

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    void m() {
        System.out.println("Single Enum!");
    }

}
