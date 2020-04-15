package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements Cloneable {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    public String get() {
        return COLORS[(int) Math.random() * COLORS.length];
    }
}
