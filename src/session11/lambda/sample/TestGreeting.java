package session11.lambda.sample;

public class TestGreeting {
    
    public static void main(String[] args) {

        Greeting obj = new Greeting();
        
        obj.doGreeting( new LanguageInterface() {
            public void sayHello() {
               System.out.println("Salam!");
            }
        }  );
        
        obj.doGreeting( new LanguageInterface() {
            public void sayHello() {
               System.out.println("Hello!");
            }
        }  );

        obj.doGreeting( () -> System.out.println("Salam!") );

        // () in hamoon sayHello() hast
        obj.doGreeting( () -> { // Lambda (from Java 8)
               System.out.println("Hello!");
               System.out.println("How are you?");
            }  );

    }

}
