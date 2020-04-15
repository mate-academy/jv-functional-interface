package core.basesyntax;

import java.util.Random;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements GetColor<String> {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        return COLORS[Math.abs(new Random().nextInt(COLORS.length - 1))];
    }
}
