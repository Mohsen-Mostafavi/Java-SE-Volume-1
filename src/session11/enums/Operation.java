package session11.enums;

enum Operation {

    PLUS {
        double eval(double x, double y) { return x + y; }
    },
    MINUS {
        double eval(double x, double y) { return x - y; }
    },
    TIMES {
        double eval(double x, double y) { return x * y; }
    },
    DIVIDED_BY {
        double eval(double x, double y) { return x / y; }
    };

    // Each constant supports an arithmetic operation
    abstract double eval(double x, double y);

    public static void main(String args[]) {

        double x = 1.0;
        double y = 2.0;
        for ( Operation op : Operation.values() )
            System.out.println(x + " " + op + " " + y + " = " + op.eval(x, y) );

    }

}

/*
1.0 PLUS 2.0 = 3.0
1.0 MINUS 2.0 = -1.0
1.0 TIMES 2.0 = 2.0
1.0 DIVIDED_BY 2.0 = 0.5
*/