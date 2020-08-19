package core.basesyntax;

import core.basesyntax.interfaces.AutoTypeDeterminer;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements AutoTypeDeterminer {
    @Override
    public AutoType apply(Integer weight) {
        return weight < 1500 ? AutoType.CAR : AutoType.TRUCK;
    }
}
