package es.upm.babel.sequenceTester;

import java.io.PrintStream;
import java.io.PrintWriter;

public class TestErrorException extends RuntimeException {

    private static final long serialVersionUID = -3486394019411535690L;
    private String message;

    public TestErrorException(String message) {
        this.message = message;
    }

    @Override
    public void printStackTrace() {
        System.err.println(message);
    }

    @Override
    public void printStackTrace(PrintStream s) {
        s.println(message);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        s.println(message);
    }

}