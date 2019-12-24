package core.basesyntax;

import core.basesyntax.interfaces.CompareAutosInterface;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements CompareAutosInterface {
    public Integer apply(Integer engineVolume, Integer engineVolume1) {
        CompareAutosInterface compareAutosInterface = (first, second) -> first - second;
        return compareAutosInterface.apply(engineVolume, engineVolume1);
    }
}
