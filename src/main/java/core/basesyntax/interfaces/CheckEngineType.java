package core.basesyntax.interfaces;

import core.basesyntax.Car;

@FunctionalInterface
public interface CheckEngineType {
    boolean test(Car car);
}
