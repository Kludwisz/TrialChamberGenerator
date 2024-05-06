package kludwisz.generator.util;

import com.seedfinding.mcseed.rand.JRand;

public class ShuffleUtils {
    public static void skipShuffle(JRand rand, int size) {
        for (int i = size; i >= 1; i--)
            rand.nextInt(size);
    }
}
