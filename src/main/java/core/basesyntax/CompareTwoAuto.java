package core.basesyntax;

import java.util.function.Function;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto {

    int apply(Integer vol1, Integer vol2) {
        Function<Integer, Integer> compareAble = integer -> vol1 - vol2;
        return compareAble.apply(vol1 - vol2);
    }
}
