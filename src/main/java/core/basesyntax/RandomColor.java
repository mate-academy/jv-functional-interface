package core.basesyntax;

import core.basesyntax.interfaces.ColorRandomizer;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements ColorRandomizer {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        int randomIndex = (int) (Math.random() * COLORS.length);
        return COLORS[randomIndex];
    }
}
