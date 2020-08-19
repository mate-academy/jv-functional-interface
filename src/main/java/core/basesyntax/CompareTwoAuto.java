package core.basesyntax;

import java.util.function.BinaryOperator;

public class CompareTwoAuto implements BinaryOperator<Integer> {

    @Override
    public Integer apply(Integer engineVolume1, Integer engineVolume2) {
        return engineVolume1 - engineVolume2;
    }
}
