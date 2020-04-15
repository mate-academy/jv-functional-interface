package core.basesyntax;

@FunctionalInterface
public interface FunctionalCheckElectricCar<T> {

    boolean test(T car);
}
