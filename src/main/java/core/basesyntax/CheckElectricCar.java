package core.basesyntax;

import core.basesyntax.interfaces.EngineTypeDeterminer;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar implements EngineTypeDeterminer {
    @Override
    public boolean test(Car car) {
        return car != null && car.getEngine().getEngineType().equals(EngineType.ELECTRIC);
    }
}
