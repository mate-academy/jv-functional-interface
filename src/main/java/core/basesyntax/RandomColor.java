package core.basesyntax;

import java.util.function.Supplier;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    public String get() {
        Supplier<String> randomColor = () -> COLORS[(int) Math.random() * COLORS.length + 1];
        return randomColor.get();
    }
}
