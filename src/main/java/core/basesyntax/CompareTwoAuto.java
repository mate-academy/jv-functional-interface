package core.basesyntax;

import java.util.function.BinaryOperator;

public class CompareTwoAuto implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer powerOfFirstCar, Integer powerOfSecondCar) {
        return powerOfFirstCar - powerOfSecondCar;
    }
}
