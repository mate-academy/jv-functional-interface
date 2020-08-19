package core.basesyntax;

import java.util.Random;
import java.util.function.Supplier;

public class RandomColor implements Supplier<String> {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};
    private static Random RAND = new Random();

    @Override
    public String get() {
        int index = RAND.nextInt(COLORS.length);
        return COLORS[index];
    }
}
