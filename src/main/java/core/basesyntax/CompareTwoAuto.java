package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements CompareCarsEnginePower {

    @Override
    public Integer apply(Integer engine1, Integer engine2) {
        CompareCarsEnginePower compareCarsEnginePower = (engineFirst, engineSecond)
                -> engineFirst - engineSecond;
        return compareCarsEnginePower.apply(engine1, engine2);
    }
}
