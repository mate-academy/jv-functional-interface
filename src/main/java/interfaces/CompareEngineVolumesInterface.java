package interfaces;

@FunctionalInterface
public interface CompareEngineVolumesInterface<T> {
    T apply(T first, T second);
}
