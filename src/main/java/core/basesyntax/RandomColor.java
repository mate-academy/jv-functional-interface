package core.basesyntax;

import core.basesyntax.interfaces.PickColor;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements PickColor {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        PickColor c = () -> COLORS[(int) (Math.random() * (COLORS.length))];
        return c.get();
    }
}
