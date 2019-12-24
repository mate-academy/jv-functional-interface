package core.basesyntax;

import java.util.function.BiFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements BiFunction<Integer, Integer, Integer> {

    public Integer apply(Integer enginePower1, Integer enginePower2) {
        BiFunction<Integer, Integer, Integer> biFunction = (e1, e2) -> e1 - e2;
        return biFunction.apply(enginePower1, enginePower2);
    }
}
