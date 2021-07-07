package core.basesyntax;

import java.util.function.IntFunction;

/**
 * <p> Implement the suitable functional interface and override its method
 * that takes the car's weight and returns the type of car depending on the weight
 * (if weight is less than 1500, then CAR, if else, then TRUCK).
 * The method must accept Integer and return AutoType. </p>
 */
public class ChangeToCar implements IntFunction<AutoType> {
    private static final int WEIGHT_LIMIT = 1500;

    @Override
    public AutoType apply(int value) {
        return value < WEIGHT_LIMIT ? AutoType.CAR : AutoType.TRUCK;
    }
}
