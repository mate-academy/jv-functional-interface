package interfaces;

@FunctionalInterface
public interface CheckElectricEngineInterface<T> {
    boolean test(T car);
}
