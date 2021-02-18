package session11.classes.anonymous;

public class StartProject {

    public static void main(String[] args) {

        Programmer p1 = ProgrammerFactory.getProgrammer("Java");
        p1.code();

        ProgrammerFactory.getProgrammer("PHP").code();

    }

}
