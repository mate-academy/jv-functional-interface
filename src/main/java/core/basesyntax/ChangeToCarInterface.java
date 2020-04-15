package core.basesyntax;

@FunctionalInterface
public interface ChangeToCarInterface {
    Integer MAX_WEIGHT = 1500;

    AutoType apply(Integer weight);

}
