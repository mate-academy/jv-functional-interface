package core.basesyntax;

import java.util.function.Function;

public class ChangeToCar implements Function<Integer, AutoType> {
    private static final int CRITICAL_CAR_WEIGHT = 1500;

    @Override
    public AutoType apply(Integer weight) {
        return weight > CRITICAL_CAR_WEIGHT ? AutoType.TRUCK : AutoType.CAR;
    }
}
