package core.basesyntax;

import java.util.function.Predicate;

public class CheckElectricCar implements Predicate<Car> {

    @Override
    public boolean test(Car t) {
        return t.getEngine().getEngineType() == EngineType.ELECTRIC;
    }
}
