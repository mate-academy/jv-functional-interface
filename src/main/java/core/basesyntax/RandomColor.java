package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements RandomColorInterface {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        int randomNumber = (int) (Math.random() * COLORS.length);
        return COLORS[randomNumber];
    }
}
