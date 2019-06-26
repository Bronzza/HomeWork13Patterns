package patterns.factory.cargarrage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Car {
    private int size;
    private String name;
    private String dateOfCreation;
}
