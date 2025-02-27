import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import kludwisz.generator.TrialChambersGenerator;
import kludwisz.generator.TrialChambersPieces;
import kludwisz.structure.TrialChambers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;


public class BasicTests {
    @Test
    public void functionalitySmall() {
        TrialChambers chambers = new TrialChambers(MCVersion.v1_21);
        TrialChambersGenerator gen = new TrialChambersGenerator();

        for (int i = 0; i < 10; i++) {
            try {
                long worldseed = 123456L + i;
                CPos pos = chambers.getInRegion(worldseed, 0, 0, new ChunkRand());
                gen.generate(worldseed, pos.getX(), pos.getZ(), new ChunkRand());

                assertTrue(gen.piecesLen > 0);
                System.out.println("Generated " + gen.piecesLen + " pieces.");
            }
            catch (Exception ex) {
                System.err.println(ex.getMessage());
                fail();
            }
        }
    }

    // The tests below use in-game data, MC JE 1.21.4

    @Test
    public void correctnessSmall1() {
        final long worldseed = 5750911527439848904L;
        TrialChambers chambers = new TrialChambers(MCVersion.v1_21);
        TrialChambersGenerator gen = new TrialChambersGenerator();
        ChunkRand rand = new ChunkRand();

        assertEquals(
                chambers.getInRegion(worldseed, -1, -1, rand),
                new CPos(-21, -14)
        );

        gen.generate(worldseed, -21, -14, rand);

        BPos candle4_1 = new BPos(-295, -27, -186);
        assertFalse(Arrays.stream(gen.pieces)
                .filter(piece -> piece.pos.toImmutable().equals(candle4_1))
                .filter(piece -> piece.getName().equals("decor/candle_4"))
                .noneMatch(piece -> true));

        BPos candle4_2 = new BPos(-298, -27, -188);
        assertFalse(Arrays.stream(gen.pieces)
                .filter(piece -> piece.pos.toImmutable().equals(candle4_2))
                .filter(piece -> piece.getName().equals("decor/candle_4"))
                .noneMatch(piece -> true));

        BPos candle2 = new BPos(-295, -27, -196);
        assertFalse(Arrays.stream(gen.pieces)
                .filter(piece -> piece.pos.toImmutable().equals(candle2))
                .filter(piece -> piece.getName().equals("decor/candle_2"))
                .noneMatch(piece -> true));

        BPos deco_pot = new BPos(-309, -27, -186);
        assertFalse(Arrays.stream(gen.pieces)
                .filter(piece -> piece.pos.toImmutable().equals(deco_pot))
                .filter(piece -> piece.getName().equals("decor/scrape_pot"))
                .noneMatch(piece -> true));

        BPos dead_bush = new BPos(-334, -22, -218);
        assertFalse(Arrays.stream(gen.pieces)
                .filter(piece -> piece.pos.toImmutable().equals(dead_bush))
                .filter(piece -> piece.getName().equals("decor/dead_bush_pot"))
                .noneMatch(piece -> true));
    }

    @Test
    public void correctnessSmall2() {
        final long worldseed = -2332882447275460660L;
        TrialChambers chambers = new TrialChambers(MCVersion.v1_21);
        TrialChambersGenerator gen = new TrialChambersGenerator();
        ChunkRand rand = new ChunkRand();

        assertEquals(
                chambers.getInRegion(worldseed, -1, 0, rand),
                new CPos(-16, 12)
        );

        gen.generate(worldseed, -16, 12, rand);

        BPos ominous = new BPos(-248, -20, 202);
        assertFalse(Arrays.stream(gen.pieces)
                .filter(piece -> boundingBoxMinEquals(piece, ominous))
                .filter(piece -> piece.getName().equals("reward/ominous_vault"))
                .noneMatch(piece -> true));

        BPos vault = new BPos(-243, -21, 217);
        assertFalse(Arrays.stream(gen.pieces)
                .filter(piece -> boundingBoxMinEquals(piece, vault))
                .filter(piece -> piece.getName().equals("reward/vault"))
                .noneMatch(piece -> true));

        BPos breeze = new BPos(-243, -9, 135);
        assertFalse(Arrays.stream(gen.pieces)
                .filter(piece -> boundingBoxMinEquals(piece, breeze))
                .filter(piece -> piece.getName().equals("spawner/breeze/breeze"))
                .noneMatch(piece -> true));

        BPos dispenser = new BPos(-217, -25, 173);
        assertFalse(Arrays.stream(gen.pieces)
                .filter(piece -> boundingBoxMinEquals(piece, dispenser))
                .filter(piece -> piece.getName().equals("dispensers/wall_dispenser"))
                .noneMatch(piece -> true));

        BPos deco_pot = new BPos(-233, -7, 153);
        assertFalse(Arrays.stream(gen.pieces)
                .filter(piece -> boundingBoxMinEquals(piece, deco_pot))
                .filter(piece -> piece.getName().equals("decor/guster_pot"))
                .noneMatch(piece -> true));
    }

    private boolean boundingBoxMinEquals(TrialChambersPieces.Piece piece, BPos minPos) {
        return piece.box.minX == minPos.getX() && piece.box.minY == minPos.getY() && piece.box.minZ == minPos.getZ();
    }
}
