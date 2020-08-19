package core.basesyntax;

public class CheckElectricCar implements CheckElectric {

    @Override
    public boolean test(Car car) {
        EngineType engineType = car.getEngine().getEngineType();
        return engineType.equals(EngineType.ELECTRIC);
    }
}
