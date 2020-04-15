package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements FunctionalCompareTwoAuto<Integer> {

    @Override
    public Integer apply(Integer engineVolume1, Integer engineVolume2) {
        return engineVolume1 - engineVolume2;
    }
}
