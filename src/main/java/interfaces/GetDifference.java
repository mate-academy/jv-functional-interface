package interfaces;

@FunctionalInterface
public interface GetDifference<T> {
    T apply(T first, T second);
}
