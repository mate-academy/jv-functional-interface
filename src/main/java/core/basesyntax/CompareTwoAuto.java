package core.basesyntax;

import java.util.function.BinaryOperator;

public class CompareTwoAuto implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer power1, Integer power2) {
        return power1 - power2;
    }
}
