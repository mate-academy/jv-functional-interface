package core.basesyntax;

import java.util.function.IntFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements IntFunction<AutoType> {
    private static final int WEIGHT_LIMIT = 1500;

    @Override
    public AutoType apply(int value) {
        return value < WEIGHT_LIMIT ? AutoType.CAR : AutoType.TRUCK;
    }
}
