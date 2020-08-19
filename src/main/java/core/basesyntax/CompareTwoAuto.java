package core.basesyntax;

import java.util.function.BiFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements BiFunction<Car, Car, Integer> {
    @Override
    public Integer apply(Car firstCar, Car secondCar) {
        return Math.abs(firstCar.getEngine().getEngineVolume() - secondCar.getEngine().getEngineVolume());
    }
}
