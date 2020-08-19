package core.basesyntax.functionalinterfaces;

import core.basesyntax.Car;

@FunctionalInterface
public interface CheckElectricCarFunctional {
    boolean test(Car car);
}
