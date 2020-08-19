package core.basesyntax;

import java.util.function.Predicate;

public class CheckElectricCar implements Predicate<Car> {

    @Override
    public boolean test(Car car) {
        EngineType engineType = car.getEngine().getEngineType();
        return engineType.equals(EngineType.ELECTRIC);
    }
}
