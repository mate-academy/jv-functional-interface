package core.basesyntax;

import java.util.function.Function;

public class ChangeToCar implements Function<Integer, AutoType> {

    @Override
    public AutoType apply(Integer weight) {
        AutoType autoType;
        if (weight < 1500) {
            autoType = AutoType.CAR;
        } else {
            autoType = AutoType.TRUCK;
        }
        return autoType;
    }
}
