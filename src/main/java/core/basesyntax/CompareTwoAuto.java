package core.basesyntax;

import java.util.function.BinaryOperator;

public class CompareTwoAuto implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer engine1, Integer engine2) {
        return engine1 - engine2;
    }
}
