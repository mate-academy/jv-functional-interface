package core.basesyntax;

import java.util.function.Supplier;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements Supplier {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        Supplier<String> colorForCar = () -> COLORS[(int) (Math.random() * (COLORS.length))];
        return colorForCar.get();
    }
}
