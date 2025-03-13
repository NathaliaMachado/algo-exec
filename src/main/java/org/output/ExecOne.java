package org.output;

// Inheritance
class A {
    A() {
        System.out.println("Constructor de A");
    }
}

class B extends A {
    B() {
        System.out.println("Constructor de B");
    }
}

public class ExecOne {
    public static void main(String[] args) {
        A obj = new B();
    }
}

