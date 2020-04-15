package core.basesyntax;

@FunctionalInterface
public interface BiFunction<T, K, V> {

    V apply(T pow1, K pow2);
}
