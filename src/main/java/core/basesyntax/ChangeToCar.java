package core.basesyntax;

import java.util.function.Function;

public class ChangeToCar implements Function<Integer, AutoType> {
    private static final int CRITICAL_WEIGHT = 1500;

    @Override
    public AutoType apply(Integer carWeight) {
        return carWeight < CRITICAL_WEIGHT ? AutoType.CAR : AutoType.TRUCK;
    }
}
