package core.basesyntax;

public class CompareTwoAuto implements CompareTwoAutos {

    @Override
    public Integer apply(Integer engineVolume1, Integer engineVolume2) {
        return engineVolume1 - engineVolume2;
    }
}
