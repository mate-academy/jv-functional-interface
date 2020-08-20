package core.basesyntax;

import java.util.function.Function;

public class ChangeToCar implements Function<Integer, AutoType> {
    public static final Integer MAX_CAR_WEIGHT = 1500;

    @Override
    public AutoType apply(Integer weight) {
        return weight < MAX_CAR_WEIGHT ? AutoType.CAR : AutoType.TRUCK;
    }
}
