package core.basesyntax;

import java.util.function.Function;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements Function<Integer, AutoType> {
    private static final int BORDER_WEIGHT = 1500;

    @Override
    public AutoType apply(Integer weight) {
        return weight < BORDER_WEIGHT ? AutoType.CAR : AutoType.TRUCK;
    }
}
