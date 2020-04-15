package interfaces;

import core.basesyntax.AutoType;

@FunctionalInterface
public interface CheckAutoTypeInterface {
    AutoType apply(int weight);
}
