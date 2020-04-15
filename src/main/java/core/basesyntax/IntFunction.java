package core.basesyntax;

@FunctionalInterface
public interface IntFunction<R> {
    R apply(Integer i);
}
