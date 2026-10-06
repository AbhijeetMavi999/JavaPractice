package oops.abstraction;

abstract class Car {
    abstract void speed();

    void carModel() {
        System.out.println("CRETA V12");
    }
}

public abstract class AbstractionDemo extends Car {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            void speed() {
                System.out.println("100km/h");
            }
        };
        car.speed();
        car.carModel();
    }
}
