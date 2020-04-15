package core.basesyntax;

@FunctionalInterface
public interface CompareEnginePower<T> {
    Integer apply(T firstEngine, T secondEngine);
}
