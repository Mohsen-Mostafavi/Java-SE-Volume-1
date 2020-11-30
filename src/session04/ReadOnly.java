package session04;

import session04.immutable.Student;

public class ReadOnly { // Immutable

    private final int value;
//    private final Student student;


    public ReadOnly(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
