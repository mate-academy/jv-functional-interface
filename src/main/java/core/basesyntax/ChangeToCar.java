package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements ChangeToCarInt {
    private static final int BOUND_WEIGHT = 1500;

    @Override
    public AutoType apply(int weight) {
        return weight < BOUND_WEIGHT ? AutoType.CAR : AutoType.TRUCK;
    }
}
