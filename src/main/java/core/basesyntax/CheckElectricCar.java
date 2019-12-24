package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar {
    public boolean test(Car car) {
        CheckElectricEngine checkElectricEngine = currentCar ->
                currentCar.getEngine().getEngineType().equals(EngineType.ELECTRIC) ? true : false;
        return checkElectricEngine.checkMusk(car);
    }
}
