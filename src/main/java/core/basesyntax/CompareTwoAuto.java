package core.basesyntax;

import java.util.function.BiFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer power1, Integer power2) {
        BiFunction<Integer, Integer, Integer> compareAuto = (first, second) -> power1 - power2;
        return compareAuto.apply(power1, power2);
    }
}
