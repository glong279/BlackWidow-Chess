package com.ches.engine.classic.player.ai;

import com.ches.engine.classic.board.Board;
import com.ches.engine.classic.board.Move;

public interface MoveStrategy {

    long getNumBoardsEvaluated();

    Move execute(Board board);

}
