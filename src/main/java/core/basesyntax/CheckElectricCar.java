package core.basesyntax;

import java.util.function.Predicate;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar implements Predicate<Car> {

    private static final EngineType ELECTRIC_ENGINE = EngineType.ELECTRIC;

    @Override
    public boolean test(Car car) {
        return car.getEngine().getEngineType().equals(ELECTRIC_ENGINE);
    }
}
