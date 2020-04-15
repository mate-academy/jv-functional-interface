package core.basesyntax;

@FunctionalInterface
public interface Function<T,K> {

    K apply(T weight);
}
