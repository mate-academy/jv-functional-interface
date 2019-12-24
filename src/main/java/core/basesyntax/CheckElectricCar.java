package core.basesyntax;

import core.basesyntax.interfaces.DefiningElectricCar;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar {
    public boolean test(Car testingCar) {
        DefiningElectricCar definingElectricCar = (car) -> {
            return (car.getEngine().getEngineType() == EngineType.ELECTRIC);
        };
        return definingElectricCar.test(testingCar);
    }
}
