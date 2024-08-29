package kludwisz.generator.seedcracking;

import com.seedfinding.mccore.util.math.DistanceMetric;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.HashMap;
import java.util.HashSet;

public class Requirements {
    private int MAX_UNIQUE_OFFSET_TOLERANCE = 4;
    private int MAX_UNCERTAIN_TOLERANCE = 3;

    private final HashSet<String> bannedPieces = new HashSet<>();
    private final HashMap<String, BPos> uniquePieces = new HashMap<>();
    private final HashMap<BPos, String> certainPieces = new HashMap<>();
    private final HashMap<BPos, String> uncertainPieces = new HashMap<>();

    public final int chunkX;
    public final int chunkZ;
    public final int startPieceY;
    public final int startPieceRotationOrdinal;
    public int targetMatches;
    public Requirements(int chunkX, int chunkZ, int startPieceY, int startPieceRotationOrdinal) {
        this.chunkX = chunkX;
        this.chunkZ = chunkZ;
        this.startPieceY = startPieceY;
        this.startPieceRotationOrdinal = startPieceRotationOrdinal;
    }

    // --------------------------------------------------------------

    public void addBannedPiece(String piece) {
        bannedPieces.add(piece);
    }

    public void addUniquePiece(String piece, BPos pos) {
        uniquePieces.put(piece, pos);
        targetMatches++;
    }

    public void addCertainPiece(String piece, BPos pos) {
        certainPieces.put(pos, piece);
        targetMatches++;
    }

    public void addUncertainPiece(String piece, BPos pos) {
        uncertainPieces.put(pos, piece);
        targetMatches++;
    }

    public void setMaxMissTolerance(int tolerance) {
        this.MAX_UNCERTAIN_TOLERANCE = tolerance;
    }

    public void setMaxOffsetTolerance(int tolerance) {
        this.MAX_UNIQUE_OFFSET_TOLERANCE = tolerance;
    }

    // --------------------------------------------------------------

    public boolean isEnoughMatches(int matchedPieces) {
        return matchedPieces >= targetMatches - this.MAX_UNCERTAIN_TOLERANCE;
    }

    public boolean tooManyMisses(int missedPieces) {
        return missedPieces > this.MAX_UNCERTAIN_TOLERANCE;
    }

    // --------------------------------------------------------------

    public final Requirements.TestResult test(String piecename, BPos pos) {
        if (bannedPieces.contains(piecename))
            return Requirements.TestResult.BAD_CERTAIN_PIECE;

        if (uniquePieces.containsKey(piecename)) {
            BPos uniquePos = uniquePieces.get(piecename);
            if (pos.distanceTo(uniquePos, DistanceMetric.CHEBYSHEV) <= this.MAX_UNIQUE_OFFSET_TOLERANCE)
                return Requirements.TestResult.GOOD_CERTAIN_PIECE;
            return Requirements.TestResult.BAD_CERTAIN_PIECE;
        }

        if (certainPieces.containsKey(pos)) {
            if (certainPieces.get(pos).contains(piecename))
                return Requirements.TestResult.GOOD_CERTAIN_PIECE;
            return Requirements.TestResult.BAD_CERTAIN_PIECE;
        }

        if (uncertainPieces.containsKey(pos)) {
            String uncertainPiece = uncertainPieces.get(pos);
            if (piecename.contains(uncertainPiece))
                return Requirements.TestResult.GOOD_UNCERTAIN_PIECE;
            return Requirements.TestResult.BAD_UNCERTAIN_PIECE;
        }

        return Requirements.TestResult.NEUTRAL;
    }

    public final double getPieceQuality(String piecename, BPos pos) {
        if (bannedPieces.contains(piecename))
            return -100000.0;

        if (uniquePieces.containsKey(piecename)) {
            BPos uniquePos = uniquePieces.get(piecename);
            if (pos.distanceTo(uniquePos, DistanceMetric.CHEBYSHEV) <= this.MAX_UNIQUE_OFFSET_TOLERANCE)
                return 10.0 - pos.distanceTo(uniquePos, DistanceMetric.CHEBYSHEV);
            return -100000.0;
        }

        if (certainPieces.containsKey(pos)) {
            if (certainPieces.get(pos).contains(piecename))
                return 10.0;
            return -100000.0;
        }

        if (uncertainPieces.containsKey(pos)) {
            String uncertainPiece = uncertainPieces.get(pos);
            if (piecename.contains(uncertainPiece))
                return 2.0;
            return -2.0;
        }

        return 0.0;
    }

    public enum TestResult {
        GOOD_CERTAIN_PIECE,
        GOOD_UNCERTAIN_PIECE,
        BAD_CERTAIN_PIECE,
        BAD_UNCERTAIN_PIECE,
        NEUTRAL
    }
}
