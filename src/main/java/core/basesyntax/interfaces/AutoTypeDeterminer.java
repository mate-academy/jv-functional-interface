package core.basesyntax.interfaces;

import core.basesyntax.AutoType;

@FunctionalInterface
public interface AutoTypeDeterminer {
    AutoType apply(Integer weight);
}
