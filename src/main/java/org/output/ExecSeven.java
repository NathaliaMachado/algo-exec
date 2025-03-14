package org.output;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExecSeven {
    public static void main(String[] args) {

        try {
            throw new MyException("Customized Error!");
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
