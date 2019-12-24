package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements ICompareTwoAuto {
    @Override
    public int apply(int enginePower1, int enginePower2) {
        return enginePower1 - enginePower2;
    }
}
