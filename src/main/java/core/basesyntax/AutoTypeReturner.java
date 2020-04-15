package core.basesyntax;

@FunctionalInterface
public interface AutoTypeReturner<T> {

    T apply(int i);
}
