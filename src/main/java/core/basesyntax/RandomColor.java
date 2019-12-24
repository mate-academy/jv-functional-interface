package core.basesyntax;

import core.basesyntax.interfaces.SettingRandomColor;

import java.util.Random;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    public String get() {
        SettingRandomColor setColor = () -> {
            int random = new Random().nextInt(COLORS.length);
            return COLORS[random];
        };
        return setColor.get();
    }
}
