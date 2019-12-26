package core.basesyntax;

import java.util.function.BiFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements BiFunction<Integer, Integer, Integer> {
    @Override
    public Integer apply(Integer valueOne, Integer valueTwo) {
        BiFunction<Integer, Integer, Integer> compareAuto = (one1, two1) -> valueOne - valueTwo;
        return compareAuto.apply(valueOne, valueTwo);
    }
}
