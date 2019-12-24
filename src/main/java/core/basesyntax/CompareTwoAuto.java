package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto {
    int apply(Integer vol1, Integer vol2) {
        CompareAble compareAble = (vol11, vol21) -> vol1 - vol2;
        return compareAble.compareEngine(vol1, vol2);
    }
}
