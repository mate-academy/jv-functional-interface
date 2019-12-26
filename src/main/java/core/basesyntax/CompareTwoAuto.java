package core.basesyntax;

import java.util.function.BiFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto  implements BiFunction<Integer,Integer,Integer> {

    @Override
    public Integer apply(Integer o1, Integer o2) {
        BiFunction<Integer, Integer, Integer> biFunction = (power1, power2) -> o1 - o2;
        return biFunction.apply(o1, o2);
    }
}
