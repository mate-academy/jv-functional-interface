package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar {
    public AutoType apply(Integer weight) {
        ChooseCarType chooseCarType = (carWeight) -> {
            if (weight < 1500) {
                return AutoType.CAR;
            }
            return AutoType.TRUCK;
        };
        return chooseCarType.check(weight);
    }
}
