package core.basesyntax;

import java.util.function.BiFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto {

    public Integer apply(Integer carPower1, Integer carPower2) {
        BiFunction<Integer, Integer, Integer> differenceEngines = (c1, c2) -> c1 - c2;
        return differenceEngines.apply(carPower1, carPower2);
    }
}
