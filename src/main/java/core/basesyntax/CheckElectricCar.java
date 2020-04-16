package core.basesyntax;

import java.util.function.Predicate;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar implements Predicate<Car> {
    public static final EngineType ELECTRIC = EngineType.ELECTRIC;

    @Override
    public boolean test(Car t) {
        return t.getEngine().getEngineType() == ELECTRIC;
    }
}
