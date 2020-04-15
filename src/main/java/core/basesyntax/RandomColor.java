package core.basesyntax;

import java.util.Random;
import java.util.function.Supplier;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    public String get() {
        Supplier<String> randomColor = () -> {
            Random random = new Random();
            return COLORS[random.nextInt(COLORS.length - 1)];
        };
        return randomColor.get();
    }
}
