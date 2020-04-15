package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements EnginePowerComparator<Integer> {

    @Override
    public int apply(Integer int1, Integer int2) {
        return int1 - int2;
    }
}
