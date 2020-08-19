package core.basesyntax;

import java.util.function.Function;

public class ChangeToCar implements Function<Integer, AutoType> {
    private static final int MASS_CHANGE_TYPE = 1500;

    @Override
    public AutoType apply(Integer weight) {
        return weight < MASS_CHANGE_TYPE ? AutoType.CAR : AutoType.TRUCK;
    }
}
