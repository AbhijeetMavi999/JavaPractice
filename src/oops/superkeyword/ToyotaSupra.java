package oops.superkeyword;

public class ToyotaSupra extends Car {

    String name = "Supra s7";

    public void getNames() {
        System.out.println(name);
        System.out.println(super.name);
        super.run();
    }

    public static void main(String[] args) {
        ToyotaSupra toyotaSupra = new ToyotaSupra();
        toyotaSupra.getNames();
    }
}
