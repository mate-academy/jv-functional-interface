package core.basesyntax;

import java.util.Random;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements PickColor {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        PickColor pickColor = () -> COLORS[new Random().nextInt(COLORS.length)];
        return pickColor.get();
    }
}
