package accessmodifiers.abstractmodifier;

abstract class Vehicle {
    abstract int getNumberOfWheels();
}

class Bus extends Vehicle {
    @Override
    public int getNumberOfWheels() {
        return 6;
    }
}

class Auto extends Vehicle {
    @Override
    int getNumberOfWheels() {
        return 3;
    }
}

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println("Number of wheels in bus: "+bus.getNumberOfWheels());
        Auto auto = new Auto();
        System.out.println("Number of wheels in auto: "+auto.getNumberOfWheels());
    }
}
