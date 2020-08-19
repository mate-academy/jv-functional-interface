package core.basesyntax;

import core.basesyntax.functionalinterfaces.ChangeToCarFunctional;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements ChangeToCarFunctional {

    private static final int WEIGHT_FOR_CHECK = 1500;

    @Override
    public AutoType apply(Integer weight) {
        return weight < WEIGHT_FOR_CHECK ? AutoType.CAR : AutoType.TRUCK;
    }
}
