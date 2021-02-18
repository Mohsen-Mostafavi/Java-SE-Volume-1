package session11.classes.anonymous;

public class ProgrammerFactory {

    public static Programmer getProgrammer(String type) {

        Programmer p = null; // Programmer is an interface

        switch(type) {

            case "HTML" : p = new Programmer() { // ProgrammerFactory$1.class
                                      {/* Init-Block */}
                                      @Override
                                      public void code() { System.out.println("HTML"); }
                              };
                          break;

            case "Java" : p = new Programmer() { public void code() { System.out.println("Java"); } }; // ProgrammerFactory$2.class
                          break;

            case "PHP" : p = new Programmer() { public void code() { System.out.println("PHP"); } }; // ProgrammerFactory$3.class
                         break;

        }

        return p;

    }

    Object o = new Object() { // Anonymous class
        @Override
        public String toString() {
            return "I am Anonymous!";
        }
    };

}
