package org.output;

class Father {
    void show() {
        System.out.println("Father");
    }
}

class Son extends Father {
    void show() {
        System.out.println("Son");
    }
}

public class ExecSix {
    public static void main(String[] args) {
        Father p = new Son();
        p.show();
    }
}
