package core.basesyntax;

@FunctionalInterface
public interface BiFunction<T, U, R> {

    R apply(T pow1, U pow2);
}
