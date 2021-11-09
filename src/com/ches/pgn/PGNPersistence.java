package com.ches.pgn;

import com.ches.engine.classic.board.Board;
import com.ches.engine.classic.board.Move;
import com.ches.engine.classic.player.Player;

public interface PGNPersistence {

    void persistGame(Game game);

    Move getNextBestMove(Board board, Player player, String gameText);

}
