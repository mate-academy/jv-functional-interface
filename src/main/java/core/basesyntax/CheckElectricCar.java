package core.basesyntax;

import java.util.function.Predicate;

public class CheckElectricCar implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return (car.getEngine().getEngineType().equals(EngineType.ELECTRIC)) ? true : false;
    }
}
