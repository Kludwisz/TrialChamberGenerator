package kludwisz.generator.util;

import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mcseed.rand.JRand;

public class ShuffleUtils {
    public static void skipShuffle(JRand rand, int size) {
        for (int i = size; i > 1; i--)
            rand.nextInt(i);
    }

    public static void skipRotationShuffle(JRand rand) {
        rand.nextSeed();
        rand.nextInt(3);
        rand.nextSeed();
    }

    public static void shuffleRotations(JRand rand, BlockRotation[] arr) {
        int j = rand.nextInt(4);
        BlockRotation tmp = arr[3];
        arr[3] = arr[j];
        arr[j] = tmp;

        j = rand.nextInt(3);
        tmp = arr[2];
        arr[2] = arr[j];
        arr[j] = tmp;

        j = rand.nextInt(2);
        tmp = arr[1];
        arr[1] = arr[j];
        arr[j] = tmp;
    }

    public static void shuffle(JRand rand, int[] arr, int len) {
        for (int i = len; i > 1; i--) {
            int j = rand.nextInt(i);
            int tmp = arr[i - 1];
            arr[i - 1] = arr[j];
            arr[j] = tmp;
        }
    }

    public static void shuffle(JRand rand, Object[] arr, int len) {
		for (int i = len; i > 1; i--) {
            int j = rand.nextInt(i);
            Object tmp = arr[i - 1];
            arr[i - 1] = arr[j];
            arr[j] = tmp;
        }
    }

    public static void shuffleFallbackPool21(JRand rand, int[] arr, final int len) {
        int j = len + rand.nextInt(4);
        int tmp = arr[len + 3];
        arr[len + 3] = arr[j];
        arr[j] = tmp;

        j = len + rand.nextInt(3);
        tmp = arr[len + 2];
        arr[len + 2] = arr[j];
        arr[j] = tmp;

        j = len + rand.nextInt(2);
        tmp = arr[len + 1];
        arr[len + 1] = arr[j];
        arr[j] = tmp;
    }
}
