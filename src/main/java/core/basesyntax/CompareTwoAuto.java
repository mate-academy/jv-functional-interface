package core.basesyntax;

import java.util.function.BiFunction;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements BiFunction<Integer, Integer, Integer> {
    public Integer apply(Integer engineVolume, Integer engineVolume1) {
        BiFunction<Integer, Integer, Integer> compareAutos = (first, second) -> first - second;
        return compareAutos.apply(engineVolume, engineVolume1);
    }
}
