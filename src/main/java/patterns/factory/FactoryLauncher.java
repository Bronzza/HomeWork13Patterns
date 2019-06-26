package patterns.factory;

import patterns.factory.cargarrage.Car;
import patterns.factory.cargarrage.UniqueCar;

public class FactoryLauncher {
    public static void main(String[] args) {
        Car car;
        Car car2;
        Car car3;
        CarRetailer carRetailer = new CarRetailer(new ComplicatedCarBuilder());
        car = carRetailer.sellCar();
        carRetailer.setLocalCarBuilder(new UniqueCarBuilder());
        car2 = carRetailer.sellCar();
        car3 = UniqueCar.getInstance();
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car2 == car3);
    }
}
