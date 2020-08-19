package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который принимает вес авто
 * и возвращает тип авто в зависимости от веса (если weight меньше 1500, то CAR, если больше, то
 * TRUCK). Метод должен принимать Integer и возвращать AutoType</p>
 */
public class ChangeToCar implements ChangeToCarInterface {
    @Override
    public AutoType apply(int weigh) {
        if (weigh < 1500) {
            return AutoType.CAR;
        }
        return AutoType.TRUCK;
    }
}
