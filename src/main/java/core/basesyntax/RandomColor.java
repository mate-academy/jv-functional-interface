package core.basesyntax;

import java.util.Random;
import java.util.function.Supplier;

/**
 * <p>Implement the suitable functional interface and override its method that should
 * return the random color from the given array — `COLORS`</p>
 */
public class RandomColor implements Supplier<String> {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};
    private static final int SIZE = COLORS.length;

    @Override
    public String get() {
        return COLORS[new Random().nextInt(SIZE)];
    }
}
