package core.basesyntax;

import java.util.function.Function;

public class ChangeToCar implements Function<Integer, AutoType> {
    private static final int MAX_WEIGHT = 1500;

    @Override
    public AutoType apply(Integer weight) {
        return (weight < MAX_WEIGHT) ? AutoType.CAR : AutoType.TRUCK;
    }
}
