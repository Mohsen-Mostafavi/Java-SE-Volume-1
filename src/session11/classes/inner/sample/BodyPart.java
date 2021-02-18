package session11.classes.inner.sample;

public abstract class BodyPart {

    private String name;

    public BodyPart() {
        System.out.println("An object of BodyPart is created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
