package core.basesyntax.interfaces;

import core.basesyntax.Car;

@FunctionalInterface
public interface EngineTypeDeterminer {
    boolean test(Car car);
}
