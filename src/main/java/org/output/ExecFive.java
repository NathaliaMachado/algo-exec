package org.output;

// Exception
public class ExecFive {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } finally {
            System.out.println("Block finally executed");
        }
    }
}
