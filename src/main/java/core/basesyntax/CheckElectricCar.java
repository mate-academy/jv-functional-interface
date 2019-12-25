package core.basesyntax;

import java.util.function.Predicate;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar implements Predicate<Car> {
    Predicate<Car> predicate = (car) -> car.getEngine().getEngineType() == EngineType.ELECTRIC;

    @Override
    public boolean test(Car car) {
        return predicate.test(car);
    }
}
