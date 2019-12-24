package core.basesyntax;

import java.util.function.BiFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */

public class CompareTwoAuto implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer engine1, Integer engine2) {
        BiFunction<Integer, Integer, Integer> biFunction = (engineFirst, engineSecond)
                -> engine1 - engine2;
        return biFunction.apply(engine1, engine2);
    }
}
