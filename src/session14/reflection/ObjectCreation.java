package session14.reflection;

public class ObjectCreation {
    
    public static void main(String[] args) throws Exception {
        
//        X x = new X();
        
        //---------------------
        
//        String className = "X";
//        Class c = Class.forName( className );
//        Object obj = c.newInstance();
//        X x = (X)obj;
        
        //---------------------
        
       Object obj = X.class.newInstance();


//       Constructor<Y> constructor = Y.class.getDeclaredConstructor();
//       constructor.setAccessible(true);
//       Y y = constructor.newInstance();

    }

}
