package core.basesyntax;

import interfaces.TestObject;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar implements TestObject<Car> {
    @Override
    public boolean test(Car car) {
        return car.getEngine().getEngineType().equals(EngineType.ELECTRIC);
    }
}
