package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements RandomColour {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        RandomColour randColor = () -> COLORS[(int) (Math.random() * COLORS.length + 1)];
        return randColor.get();
    }
}
