package session03;

class Student {
    int i;
    double d;
    String s;

    { // Initialization Block
        System.out.println("Initialization Block is running!");

    }


    Student() {
        // code
        System.out.println("An Object of Student created! (No argument constructor is running!)");

    }

    public Student(int i, double d, String s) {
        this(); // call Student()
        System.out.println("3 arguments constructor is running!");
        this.i = i;
        this.d = d;
        this.s = s;

    }

    public Student(int i) {
        this(); // call the Student()
        this.i = i;
    }

    public Student( Student another ) { // Copy Constructor

        this.i = another.i;
        this.d = another.d;
        this.s = another.s;

    }

    void m1(){

    }
}
