package core.basesyntax;

@FunctionalInterface
public interface ElectricEngineChecker<T> {
    boolean test(T t);
}
