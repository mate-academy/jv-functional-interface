package core.basesyntax;

@FunctionalInterface
public interface CheckEngine<T> {
    boolean test(T car);
}
