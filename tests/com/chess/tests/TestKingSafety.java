package com.ches.tests;

import org.junit.Test;

import com.ches.engine.classic.Alliance;
import com.ches.engine.classic.board.Board;
import com.ches.engine.classic.board.Board.Builder;
import com.ches.engine.classic.pieces.King;
import com.ches.engine.classic.pieces.Pawn;

public class TestKingSafety {

    @Test
    public void test1() {
        final Builder builder = new Builder();
        // Black Layout
        builder.setPiece(new King(Alliance.BLACK, 4, false, false));
        builder.setPiece(new Pawn(Alliance.BLACK, 12));
        // White Layout
        builder.setPiece(new Pawn(Alliance.WHITE, 52));
        builder.setPiece(new King(Alliance.WHITE, 60, false, false));
        builder.setMoveMaker(Alliance.WHITE);
        // Set the current player
        final Board board = builder.build();

        //assertEquals(KingSafetyAnalyzer.get().calculateKingTropism(board.whitePlayer()).tropismScore(), 40);
    }

}