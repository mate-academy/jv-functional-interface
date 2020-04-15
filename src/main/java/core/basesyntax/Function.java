package core.basesyntax;

@FunctionalInterface
public interface Function<T,R> {

    R apply(T weight);
}
