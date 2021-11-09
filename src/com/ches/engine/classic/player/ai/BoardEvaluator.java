package com.ches.engine.classic.player.ai;

import com.ches.engine.classic.board.Board;

public interface BoardEvaluator {

    int evaluate(Board board, int depth);

}
