package core.basesyntax;

import interfaces.CompareEngineVolumesInterface;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements CompareEngineVolumesInterface<Integer> {
    @Override
    public Integer apply(Integer first, Integer second) {
        return first - second;
    }
}
