package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar implements CheckEngine<Car> {

    @Override
    public boolean test(Car car) {
        CheckEngine<Car> checkEngine =
                currentCar -> currentCar.getEngine().getEngineType()
                        .equals(EngineType.ELECTRIC);
        return checkEngine.test(car);
    }
}
