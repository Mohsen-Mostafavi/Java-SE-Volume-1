package session09.cloning;

public class TestSheep {
    
    public static void main(String[] args) throws Exception {
        
        Sheep shaun = new Sheep();
        shaun.d = 'C';
        shaun.n = 'T';
        shaun.a = 'G';

        System.out.println("----------------------------");

//        Sheep dolly = shaun.clone();

        Sheep dolly = new Sheep(shaun.d, shaun.n, shaun.a);

        System.out.println( "Original Object HashCode: " + shaun.hashCode() );
        System.out.println( "Clone Object HashCode: " + dolly.hashCode() );

        if (shaun != dolly) System.out.println("Another Sheep (new object)");
        else System.out.println("The same sheep");

        if (shaun.d == dolly.d &&
            shaun.n == dolly.n &&
            shaun.a == dolly.a ) System.out.println("The Same DNA Sequence! (same values)");
        else System.out.println("Different DNA!");

        // Call By Value GoodClass

//        change( shaun.clone() ); // The original object will not change
//        System.out.println( shaun.d ); // Original Remains C
//
//        change( shaun ); // Original object will change
//        System.out.println( shaun.d ); // Original Changes to T

    }
    
    static void change(Sheep s) {
        s.d = 'T';
    }

}

