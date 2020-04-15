package interfaces;

@FunctionalInterface
public interface CalculateType<T, V> {
    T apply(V value);
}
