package core.basesyntax;

import java.util.Random;
import java.util.function.Supplier;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements Supplier<String> {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};
    private String color;

    public RandomColor() {
        color = COLORS[new Random().nextInt(COLORS.length)];
    }

    public String get() {
        return color;
    }
}
