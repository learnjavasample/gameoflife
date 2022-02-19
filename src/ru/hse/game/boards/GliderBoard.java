package ru.hse.game.boards;

import ru.hse.game.boards.exception.BoardException;

public class GliderBoard extends Board {

    public GliderBoard(int height, int width) {
        super(height, width);

        if (height < 5 || width < 5) {
            throw new BoardException("Impossible to create such board");
        }
    }

    @Override
    public void fillBoard() {
        fillBoardEmpty();
        cells[2][2].setState(true);
        cells[3][3].setState(true);
        cells[4][1].setState(true);
        cells[4][2].setState(true);
        cells[4][3].setState(true);
    }
}
