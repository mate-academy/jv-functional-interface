package core.basesyntax;

import java.util.function.Function;

public class ChangeToCar implements Function<Integer, AutoType> {
    @Override
    public AutoType apply(Integer carWeight) {
        return carWeight < 1500 ? AutoType.CAR : AutoType.TRUCK;
    }
}
