package interfaces;

import core.basesyntax.Car;

@FunctionalInterface
public interface CheckElectricEngineInterface {
    boolean test(Car car);
}
