package core.basesyntax;

@FunctionalInterface
public interface SettingCar<T> {
    T apply(Integer weight);
}
