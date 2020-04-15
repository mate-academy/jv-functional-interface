package core.basesyntax;

@FunctionalInterface
public interface ComparePower<T> {
    int apply(T engineVolume1, T engineVolum2);
}
