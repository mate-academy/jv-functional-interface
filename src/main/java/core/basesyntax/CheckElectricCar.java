package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar implements Check {
    @Override
    public boolean test(Car item) {
        Check check = item1 -> item.getEngine().getEngineType() == EngineType.ELECTRIC;
        return check.test(item);
    }
}
