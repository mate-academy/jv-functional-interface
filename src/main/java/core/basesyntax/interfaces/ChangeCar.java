package core.basesyntax.interfaces;

import core.basesyntax.AutoType;

@FunctionalInterface
public interface ChangeCar {
    AutoType apply(Integer weight);
}
