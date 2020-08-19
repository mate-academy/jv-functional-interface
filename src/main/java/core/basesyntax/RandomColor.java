package core.basesyntax;

import java.util.Random;

public class RandomColor implements PickColor {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};
    private static Random RAND = new Random();

    @Override
    public String get() {
        int index = RAND.nextInt(COLORS.length);
        return COLORS[index];
    }
}
