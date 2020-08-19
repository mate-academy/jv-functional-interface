package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements ChangeToCarInterface {
    private static final int CHECK_WEIGH = 1500;

    @Override
    public AutoType apply(int weigh) {
        return weigh < CHECK_WEIGH ? AutoType.CAR : AutoType.TRUCK;
    }
}
