package core.basesyntax;

public class ChangeToCar implements ChangeCar {
    @Override
    public AutoType apply(Integer weight) {
        AutoType autoType;
        if (weight < 1500) {
            autoType = AutoType.CAR;
        } else {
            autoType = AutoType.TRUCK;
        }
        return autoType;
    }
}
