package session16.thread;

public class T11MultithreadException {

    public static void main(String[] args) throws Exception {

        System.out.println("Main Thread Starts...");

        new Thread(() -> { throw new RuntimeException(); } ).start();

        new Thread(() -> { throw new RuntimeException(); } ).start();

        new Thread(() -> { throw new RuntimeException(); } ).start();

        System.out.println("Main Thread Continues...");

    }

}
