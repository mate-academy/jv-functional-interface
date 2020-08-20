package core.basesyntax;

import java.util.function.BinaryOperator;

public class CompareTwoAuto implements BinaryOperator<Integer> {

    @Override
    public Integer apply(Integer engineVolumeFirst, Integer engineVolumeSecond) {
        return engineVolumeFirst - engineVolumeSecond;
    }
}
