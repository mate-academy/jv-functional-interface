package core.basesyntax;

@FunctionalInterface
public interface EnginePowerComparator<T> {
    int apply(T t1, T t2);
}
