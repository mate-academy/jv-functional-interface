package core.basesyntax;

import java.util.function.BinaryOperator;

/**
 * <p> Implement the suitable functional interface and override its method
 * for engines power comparison in two cars (enginePower)
 * and return the difference between them. The method must accept Integer. </p>
 */
public class CompareTwoAuto implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer firstEngineVolume, Integer secondEngineValue) {
        return firstEngineVolume - secondEngineValue;
    }
}
