package session09.cloning;

public class Sheep implements Cloneable {
    
    char d;
    char n;
    char a;

    {
        System.out.println("Running Initialization Block...");
    }

    public Sheep() {
        System.out.println("Running Sheep Constructor()...");
    }

    public Sheep(char d,char n,char a){
        System.out.println("Running Sheep CopyConstructor()...");
        this.d=d;
        this.n = n;
        this.a = a;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

//    public Sheep myClone() throws CloneNotSupportedException {
//        return (Sheep) super.clone();
//    }

}
