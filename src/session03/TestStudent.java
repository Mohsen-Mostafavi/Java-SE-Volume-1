package session03;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.i = 100;
        s1.d = 5.5;
        s1.s = "ACM";

        Student s2 = new Student(100, 5.5, "ACM");

        Student s3  = new Student(s2);

    }

}
