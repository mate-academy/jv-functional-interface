package core.basesyntax;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T car);
}
