package core.basesyntax;

import java.util.function.BinaryOperator;

public class CompareTwoAuto implements BinaryOperator<Integer> {

    @Override
    public Integer apply(Integer volume1, Integer volume2) {
        return volume1 - volume2;
    }
}
