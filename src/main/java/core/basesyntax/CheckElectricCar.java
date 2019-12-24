package core.basesyntax;

import java.util.function.BooleanSupplier;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar {
    boolean test(Car car2) {
        BooleanSupplier predicate = () -> car2.getEngine().getEngineType() == EngineType.ELECTRIC;
        return predicate.getAsBoolean();
    }
}
