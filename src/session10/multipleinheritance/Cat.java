package session10.multipleinheritance;

public interface Cat extends Animal {

    default void eat() {
        System.out.println("Drinking Milk...");
    }

    void miomio();

}
