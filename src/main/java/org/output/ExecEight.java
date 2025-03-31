package org.output;

class Test {
    static {
        System.out.println("Static block executed!");
    }

    Test() {
        System.out.println("Constructor executed!");
    }
}

public class ExecEight {
    public static void main(String[] args) {
        Test t = new Test();
    }
}
