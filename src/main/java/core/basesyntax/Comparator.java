package core.basesyntax;

@FunctionalInterface
public interface Comparator {
    Integer apply(Integer firstVolume, Integer secondVolume);
}
