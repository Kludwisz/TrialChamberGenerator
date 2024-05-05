package kludwisz.generator;

import com.seedfinding.mccore.util.math.DistanceMetric;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.HashMap;
import java.util.HashSet;

public class PieceDataSet {
    public static final int MAX_UNIQUE_OFFSET_TOLERANCE = 1;
    public static final int MAX_UNCERTAIN_TOLERANCE = 3;

    private final HashSet<String> bannedPieces = new HashSet<>();
    private final HashMap<String, BPos> uniquePieces = new HashMap<>();
    private final HashSet<BPos> certainEmptyPieces = new HashSet<>();
    private final HashMap<BPos, String> uncertainPieces = new HashMap<>();

    public final int startPieceY;
    public final int startPieceRotationOrdinal;
    public int targetMatches;
    public PieceDataSet(int startPieceY, int startPieceRotationOrdinal) {
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

    public void addCertainEmptyPiece(BPos pos) {
        certainEmptyPieces.add(pos);
    }

    public void addUncertainPiece(String piece, BPos pos) {
        uncertainPieces.put(pos, piece);
        targetMatches++;
    }

    // --------------------------------------------------------------

    public final PieceCheckResult checkPiece(String piecename, BPos pos) {
        if (bannedPieces.contains(piecename))
            return PieceCheckResult.BAD_CERTAIN;

        if (certainEmptyPieces.contains(pos))
            return PieceCheckResult.BAD_CERTAIN;

        if (uniquePieces.containsKey(piecename)) {
            BPos uniquePos = uniquePieces.get(piecename);
            if (pos.equals(uniquePos))
                return PieceCheckResult.GOOD;
            else if (pos.distanceTo(uniquePos, DistanceMetric.MANHATTAN) <= MAX_UNIQUE_OFFSET_TOLERANCE)
                return PieceCheckResult.GOOD;
            return PieceCheckResult.BAD_CERTAIN;
        }

        if (uncertainPieces.containsKey(pos)) {
            String uncertainPiece = uncertainPieces.get(pos);
            if (piecename.contains(uncertainPiece))
                return PieceCheckResult.GOOD;
            return PieceCheckResult.BAD_UNCERTAIN;
        }

        return PieceCheckResult.NEUTRAL;
    }

    // --------------------------------------------------------------

    public enum PieceCheckResult {
        NEUTRAL,
        GOOD,
        BAD_UNCERTAIN,
        BAD_CERTAIN
    }
}
