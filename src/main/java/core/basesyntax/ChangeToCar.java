package core.basesyntax;

import java.util.function.Function;

public class ChangeToCar implements Function<Integer, AutoType> {
    private static final int WEIGHT = 1500;

    @Override
    public AutoType apply(Integer integer) {
        return integer > WEIGHT ? AutoType.TRUCK : AutoType.CAR;
    }
}
