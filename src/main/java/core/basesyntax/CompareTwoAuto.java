package core.basesyntax;

import java.util.function.BiFunction;

/**
 * <p> Implement the suitable functional interface and override its method
 * for engines power comparison in two cars (enginePower)
 * and return the difference between them. The method must accept Integer. </p>
 */
public class CompareTwoAuto implements BiFunction<Integer, Integer, Integer> {
    public Integer apply(Integer firstEngine, Integer secondEngine) {
        return firstEngine - secondEngine;
    }
}
