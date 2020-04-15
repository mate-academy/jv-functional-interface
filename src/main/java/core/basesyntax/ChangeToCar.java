package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements SettingCar<AutoType> {
    private static final int LIMIT_WEIGHT = 1500;

    @Override
    public AutoType apply(Integer weight) {
        return weight >= LIMIT_WEIGHT ? AutoType.TRUCK : AutoType.CAR;
    }
}
