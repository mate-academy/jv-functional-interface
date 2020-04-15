package core.basesyntax;

@FunctionalInterface
public interface CheckElectricCarInterface<T> {
    boolean test(T car);
}
