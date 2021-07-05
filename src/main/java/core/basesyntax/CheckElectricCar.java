package core.basesyntax;

import java.util.function.Predicate;

/**
 * <p> Implement the suitable functional interface and override its method that makes validation
 * whether EngineType.ELECTRIC is installed on an auto. The method must accept Car. </p>
 */
public class CheckElectricCar implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.getEngine().getEngineType() == EngineType.ELECTRIC;
    }
}
