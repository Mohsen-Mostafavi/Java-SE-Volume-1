package session11.enums;

public class SingleEnumTest {
    
    public static void main(String[] args) {
        
        SingleEnum my = SingleEnum.INSTANCE;

        SingleEnum.INSTANCE.m();

        Object obj = SingleEnum.INSTANCE;
        System.out.println( obj.getClass().getName() ); // session11.enums.SingleEnum

    }

}
