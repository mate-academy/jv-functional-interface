package core.basesyntax;

@FunctionalInterface
public interface IsElectric<T> {
    boolean test(T car);
}
