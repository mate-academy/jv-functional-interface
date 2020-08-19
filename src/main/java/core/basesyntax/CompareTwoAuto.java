package core.basesyntax;

import core.basesyntax.interfaces.ComparatorAuto;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements ComparatorAuto {
    @Override
    public int apply(Integer e1, Integer e2) {
        if (e1 == null || e2 == null) {
            throw new NullPointerException();
        }
        return e1 - e2;
    }
}
