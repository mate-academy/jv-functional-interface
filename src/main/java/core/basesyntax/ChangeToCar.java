package core.basesyntax;

import core.basesyntax.interfaces.ChangeCar;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements ChangeCar {

    @Override
    public AutoType apply(Integer weight) {
        ChangeCar changeCar = weight1 -> weight > 1500 ? AutoType.TRUCK : AutoType.CAR;
        return changeCar.apply(weight);
    }
}
