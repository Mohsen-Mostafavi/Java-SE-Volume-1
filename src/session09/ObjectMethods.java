package session09;

public class ObjectMethods implements Cloneable {

    int i;
    String s;
    double d;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectMethods myType = (ObjectMethods) o;

        if (i != myType.i) return false;
        if (Double.compare(myType.d, d) != 0) return false;
        return !(s != null ? !s.equals(myType.s) : myType.s != null);


    }

//    @Override
//    public int hashCode() {
//
//    -***
//    }

    @Override
    public String toString() {

        return "ObjectMethods{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", d=" + d +
                '}';

    }

//    Object myClone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
    @Override
    public ObjectMethods clone() throws CloneNotSupportedException {
        return (ObjectMethods) super.clone();
    }

    public static void main(String[] args) throws Exception {

        ObjectMethods obj1 = new ObjectMethods();
        obj1.i = 123;
        ObjectMethods obj2 = obj1.clone();
        System.out.println( obj2.i );

    }

}
