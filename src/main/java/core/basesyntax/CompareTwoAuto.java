package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements ComparePower<Integer> {
    @Override
    public int apply(Integer engineVolume1, Integer engineVolume2) {
        return engineVolume1 - engineVolume2;
    }
}
