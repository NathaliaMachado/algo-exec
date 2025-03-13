package org.output;

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ExecThree {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Carlos");
        System.out.println(p.getName());
    }
}
