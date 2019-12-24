package core.basesyntax.interfaces;

import core.basesyntax.Car;

@FunctionalInterface
public interface DefiningElectricCar {
    boolean test(Car car);
}
