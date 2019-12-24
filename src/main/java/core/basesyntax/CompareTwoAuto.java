package core.basesyntax;

import core.basesyntax.interfaces.ComparingEngineVolume;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto {
    public int apply(int firstVolume, int secondVolume) {
        ComparingEngineVolume comparingEngineVolume = (firstV, secondV) -> {
            return firstV - secondV;
        };
        return comparingEngineVolume.apply(firstVolume, secondVolume);
    }
}
