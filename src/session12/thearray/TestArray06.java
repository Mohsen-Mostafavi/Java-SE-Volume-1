package session12.thearray;

public class TestArray06 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        printNumbers(numbers);


        // Initialization
        int[] numbers2 = {10,20,30};
        printNumbers( numbers2 );


        // Anonymous Array
        printNumbers( new int[] {10, 20, 30} );


        printNumbers2();
        printNumbers2(10);
        printNumbers2(10,20);
        printNumbers2(10,20,30);
        printNumbers2( new int[] {10, 20, 30} );


        sayHello( new String[] {"D", "E", "F"} );

        // int[] arr = increaseNumbers( new int[] {1, 2, 3} );

    }

    static void sayHello(String[] names) {

        for (int i=0; i < names.length; i++)
            System.out.println("Hello " + names[i]);

    }

    static void printNumbers(int[] numbers) {

        for (int i=0; i < numbers.length; i++)
            System.out.println( numbers[i] );

    }

    static void printNumbers2(int... numbers) {

        for (int i=0; i < numbers.length; i++)
            System.out.println( numbers[i] );

    }

//    static int[] increaseNumbers(int[] numbers) {
//
//        for (int i=0; i < numbers.length; i++)
//            numbers[i] += 10;
//
//        return numbers;
//
//    }


}
