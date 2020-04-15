package core.basesyntax;

import interfaces.GetRandomColorInterface;
import java.util.Random;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements GetRandomColorInterface {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }
}
