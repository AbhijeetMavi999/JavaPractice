package oops.inheritance.multilevelinheritance;

class A {
    void a() {
        System.out.println("A");
    }
    private void sayHello() {
        System.out.println("Hello!");
    }
}

class B extends A {
    void b() {
        System.out.println("B");
    }
}

class C extends B {
    void c() {
        System.out.println("C");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.a();
        c.b();
        c.c();
    }
}
