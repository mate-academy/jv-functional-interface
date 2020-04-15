package core.basesyntax;

import java.util.function.BinaryOperator;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto {
    public Integer apply(Integer enginePower1, Integer enginePower2) {
        BinaryOperator<Integer> compareTwoAuto = (ep1, ep2) -> ep1 - ep2;
        return compareTwoAuto.apply(enginePower1, enginePower2);
    }
}
