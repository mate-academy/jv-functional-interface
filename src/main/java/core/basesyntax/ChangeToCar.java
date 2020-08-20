package core.basesyntax;

import java.util.function.Function;

public class ChangeToCar implements Function<Integer, AutoType> {

    @Override
    public AutoType apply(Integer integer) {
        return integer > 1500 ? AutoType.TRUCK : AutoType.CAR;
    }
}
