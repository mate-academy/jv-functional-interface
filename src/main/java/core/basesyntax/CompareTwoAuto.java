package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements AutoComparable {

    @Override
    public Integer apply(Integer engineVolume, Integer engineVolume1) {
        return engineVolume - engineVolume1;
    }
}
