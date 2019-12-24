package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements CompareAuto {

    @Override
    public int apply(Integer one, Integer two) {
        CompareAuto compareAuto = (one1, two1) -> one - two;
        return compareAuto.apply(one, two);
    }
}
