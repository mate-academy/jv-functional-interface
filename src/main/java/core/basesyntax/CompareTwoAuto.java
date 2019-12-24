package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto {
    Integer apply(Integer firstCarEngineVol, Integer secondCarEngineVol) {
        CompareEngineInAuto compareEngineInAuto = (firstCar, secondCar) -> {
            return firstCar - secondCar;
        };
        return compareEngineInAuto.checkEngineVolume(firstCarEngineVol, secondCarEngineVol);
    }
}
