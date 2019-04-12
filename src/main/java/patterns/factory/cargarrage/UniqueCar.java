package patterns.factory.cargarrage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class UniqueCar extends Car {
    private static UniqueCar uniqueCarInstance = null;
    private String speciality = "unique";

    private UniqueCar() {
    }

    public static UniqueCar getInstance() {
        UniqueCar localLnstance = uniqueCarInstance;
        if (localLnstance == null) {
            synchronized (UniqueCar.class) {
                localLnstance = uniqueCarInstance;
                if (localLnstance == null) {
                    uniqueCarInstance = localLnstance = new UniqueCar();
                }
            }
        }
        return localLnstance;
    }
}
