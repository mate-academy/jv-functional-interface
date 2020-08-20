package core.basesyntax;

import java.util.function.Predicate;

public class CheckElectricCar implements Predicate<Car> {

    public boolean test(Car car) {
        return car.getEngine().getEngineType() == EngineType.ELECTRIC;
    }
}
