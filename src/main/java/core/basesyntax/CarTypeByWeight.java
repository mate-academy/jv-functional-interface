package core.basesyntax;

@FunctionalInterface
public interface CarTypeByWeight {
    AutoType apply(Integer weight);
}
