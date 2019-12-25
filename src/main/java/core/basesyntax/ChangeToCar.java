package core.basesyntax;

import java.util.function.IntFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements IntFunction<AutoType> {
    IntFunction<AutoType> intFunction = (weight) -> weight < 1500 ? AutoType.CAR : AutoType.TRUCK;

    @Override
    public AutoType apply(int weight) {
        return intFunction.apply(weight);
    }
}
