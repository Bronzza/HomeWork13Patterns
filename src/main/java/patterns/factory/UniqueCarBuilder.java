package patterns.factory;

import lombok.ToString;
import patterns.factory.CarBuilder;
import patterns.factory.cargarrage.Car;
import patterns.factory.cargarrage.UniqueCar;

public class UniqueCarBuilder extends CarBuilder {

    @Override
    protected Car buildCar() {
        return UniqueCar.getInstance();
    }
}
