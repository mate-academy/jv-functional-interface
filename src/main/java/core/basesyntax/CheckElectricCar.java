package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar {
    boolean test(Car car2) {
        TypeElectricAble typeElectricAble = car -> car2.getEngine()
                .getEngineType() == EngineType.ELECTRIC;
        return typeElectricAble.checkCarType(car2);
    }
}
