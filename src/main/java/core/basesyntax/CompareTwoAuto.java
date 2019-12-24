package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements Comparator {
    @Override
    public Integer apply(Integer firstVolume, Integer secondVolume) {
        Comparator comparator = (first, second) -> first - second;
        return comparator.apply(firstVolume, secondVolume);
    }
}
