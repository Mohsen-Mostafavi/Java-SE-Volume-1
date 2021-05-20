package session13.exception;


import java.io.Closeable;

public class My implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("close() called!");
    }

    void m() throws Exception {

        if (true) throw new Exception("E1");

    }

}
