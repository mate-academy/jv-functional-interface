package core.basesyntax;

public interface CheckAutoType<T> {
    Integer MAX_WEIGHT = 1500;
    AutoType apply(T weight);
}
