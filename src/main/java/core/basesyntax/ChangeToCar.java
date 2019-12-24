package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar {
    public AutoType apply(int wei) {
        CarTypeAble carTypeAble = weight -> wei < 1500 ? AutoType.CAR : AutoType.TRUCK;
        return carTypeAble.autoType(wei);
    }
}
