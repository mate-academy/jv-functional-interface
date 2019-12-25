package core.basesyntax;

import java.util.function.BiFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer carEngine1, Integer carEngine2) {
        BiFunction<Integer, Integer, Integer> compare = (engine1, engine2) -> (engine1 - engine2);
        return compare.apply(carEngine1, carEngine2);
    }
}
