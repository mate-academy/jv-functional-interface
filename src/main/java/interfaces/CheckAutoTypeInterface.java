package interfaces;

@FunctionalInterface
public interface CheckAutoTypeInterface<T> {
    T apply(int weight);
}
