package session03.methodChain;

public class Adder {
    private int number;

    public Adder add(int i){
        this.number+=i;
        return this;
    }

    public void print(){
        System.out.println(this.number);
    }

}
