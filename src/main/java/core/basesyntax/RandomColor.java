package core.basesyntax;

import java.util.Random;
import java.util.function.Supplier;

public class RandomColor implements Supplier<String> {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }
}
