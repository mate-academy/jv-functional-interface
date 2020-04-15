package core.basesyntax;

@FunctionalInterface
public interface ChooseTypeInterface<T> {
    T apply(int weight);
}
