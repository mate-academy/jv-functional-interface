package core.basesyntax;

import core.basesyntax.interfaces.CheckEngineType;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar implements CheckEngineType {

    @Override
    public boolean test(Car car) {
        CheckEngineType engineType =
                car1 -> car.getEngine().getEngineType()
                        .equals(EngineType.ELECTRIC);
        return engineType.test(car);
    }
}
