package core.basesyntax;

import java.util.function.Function;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements Function<Integer, AutoType> {
    @Override
    public AutoType apply(Integer weight) {
        Function<Integer, AutoType> machine =
                weight1 -> weight > 1500 ? AutoType.TRUCK : AutoType.CAR;
        return machine.apply(weight);
    }
}
