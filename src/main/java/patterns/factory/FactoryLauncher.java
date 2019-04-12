package patterns.factory;

import patterns.factory.cargarrage.Car;

public class FactoryLauncher {
    public static void main(String[] args) {
        Car car;
        Car car2;
        CarRetailer carRetailer = new CarRetailer(new ComplicatedCarBuilder());
        car = carRetailer.sellCar();
        carRetailer.setLocalCarBuilder(new UniqueCarBuilder());
        car2 = carRetailer.sellCar();
        System.out.println(car);
        System.out.println(car2);
    }
}
