package core.basesyntax;

import java.util.function.Function;

/**
 * <p> Implement the suitable functional interface and override its method
 * that takes the car's weight and returns the type of car depending on the weight
 * (if weight is less than 1500, then CAR, if else, then TRUCK).
 * The method must accept Integer and return AutoType. </p>
 */
public class ChangeToCar implements Function<Integer, AutoType> {

    private static final Integer MAX_WEIGHT = 1500;

    @Override
    public AutoType apply(Integer weight) {
        return weight < MAX_WEIGHT ? AutoType.CAR : AutoType.TRUCK;
    }
}
