package session04.immutable;

public class Ref { // Any Reference Type!

    private int value; // primitive

    public Ref() {
    }

    public Ref(Ref r) { // CopyConstructor
        this.value = r.value;
    }

    public Ref(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
