package oops.inheritance.singleinheritance;

class A {
    void sayHello() {
        System.out.println("Hello!");
    }
}

class B extends A {
    void sayHi() {
        System.out.println("Hi!");
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.sayHi();
        b.sayHello();
    }
}