package core.basesyntax;

import interfaces.CompareEngineVolumesInterface;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements CompareEngineVolumesInterface {
    @Override
    public int apply(int first, int second) {
        return first - second;
    }
}
