package session11.enums;

public enum ActionType {

    Add, Delete, Edit;

    public String getDescription() {

        switch (this) {
            case Add:    return "add_action";
            case Delete: return "delete_action";
            case Edit:   return "edit_action";
        }

        return "none";
    }

    public String getCode() {

        switch (this) {
            case Add:    return "100";
            case Delete: return "200";
            case Edit:   return "300";
        }

        return "0";

    }

}