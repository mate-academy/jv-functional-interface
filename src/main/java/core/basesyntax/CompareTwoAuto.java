package core.basesyntax;

import core.basesyntax.functionalinterfaces.CompareTwoAutoFunctional;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements CompareTwoAutoFunctional {

    @Override
    public Integer apply(Integer firstEngineVolume, Integer secondEngineVolume) {
        return firstEngineVolume - secondEngineVolume;
    }
}
