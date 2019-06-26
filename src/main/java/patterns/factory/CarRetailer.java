package patterns.factory;

import lombok.Setter;
import patterns.factory.cargarrage.Car;

@Setter
public class CarRetailer {
    private CarBuilder localCarBuilder;

    public CarRetailer(CarBuilder localCarBuilder) {
        this.localCarBuilder = localCarBuilder;
    }

    public Car sellCar() {
        return localCarBuilder.buildCar();
    }
}
