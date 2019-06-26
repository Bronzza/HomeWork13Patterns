package patterns.factory;

import patterns.factory.cargarrage.Car;
import patterns.factory.cargarrage.ComplicatedCar;

public class ComplicatedCarBuilder extends CarBuilder {
    ComplicatedCar car = new ComplicatedCar();

    public ComplicatedCarBuilder setFeature(String newFeature) {
        car.setFeature(newFeature);
        return this;
    }

    public ComplicatedCarBuilder setColor(String newColor) {
        car.setColor(newColor);
        return this;
    }

    public Car build() {
        return car;
    }

    @Override
    protected Car buildCar() {
        return new ComplicatedCarBuilder()
                .setColor("Green")
                .setFeature("StereoSystem")
                .build();
    }
}
