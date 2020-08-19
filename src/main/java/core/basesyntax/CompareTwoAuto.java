package core.basesyntax;

import java.util.function.BinaryOperator;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto {
    public Integer apply(Integer engineVolume, Integer engineVolume1) {
        BinaryOperator<Integer> difference = (i1,i2) -> i1-i2;
        return difference.apply(engineVolume,engineVolume1);
    }
}
