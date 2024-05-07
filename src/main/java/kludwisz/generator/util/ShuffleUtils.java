package kludwisz.generator.util;

import com.seedfinding.mccore.util.block.BlockRotation;
import com.seedfinding.mcseed.rand.JRand;

public class ShuffleUtils {
    public static void skipShuffle(JRand rand, int size) {
        for (int i = size; i > 1; i--)
            rand.nextInt(size);
    }

    public static void shuffle(JRand rand, BlockRotation[] arr) {
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
}
