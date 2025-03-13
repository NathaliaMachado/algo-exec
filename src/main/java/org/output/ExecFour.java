package org.output;

// Abstract
abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle {
    void move() {
        System.out.println("The car is moving");
    }
}

public class ExecFour {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.move();
    }
}
