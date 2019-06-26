package patterns.factory.cargarrage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ComplicatedCar extends Car {
    private String color;
    private String feature;
}
