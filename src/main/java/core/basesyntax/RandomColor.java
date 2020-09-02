package core.basesyntax;

import java.util.function.Supplier;
/**
 * <p>Implement the suitable functional interface and override its method that should
 * return the random color from the given array — `COLORS`</p>
 */

public class RandomColor implements Cloneable, Supplier {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        return COLORS[(int) Math.random() * COLORS.length];
    }
}
