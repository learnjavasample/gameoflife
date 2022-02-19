package ru.hse.game.boards;

import ru.hse.game.boards.exception.BoardException;

public class GliderGunBoard extends Board {

    public GliderGunBoard(int height, int width) {
        super(height, width);

        if (height < 10 || width < 40) {
            throw new BoardException("Impossible to create such board");
        }
    }

    @Override
    public void fillBoard() {
        fillBoardEmpty();
        cells[5][1].setState(true);
        cells[5][2].setState(true);
        cells[6][1].setState(true);
        cells[6][2].setState(true);
        cells[5][11].setState(true);
        cells[6][11].setState(true);
        cells[7][11].setState(true);
        cells[4][12].setState(true);
        cells[3][13].setState(true);
        cells[3][14].setState(true);
        cells[8][12].setState(true);
        cells[9][13].setState(true);
        cells[9][14].setState(true);
        cells[6][15].setState(true);
        cells[4][16].setState(true);
        cells[5][17].setState(true);
        cells[6][17].setState(true);
        cells[7][17].setState(true);
        cells[6][18].setState(true);
        cells[8][16].setState(true);
        cells[3][21].setState(true);
        cells[4][21].setState(true);
        cells[5][21].setState(true);
        cells[3][22].setState(true);
        cells[4][22].setState(true);
        cells[5][22].setState(true);
        cells[2][23].setState(true);
        cells[6][23].setState(true);
        cells[1][25].setState(true);
        cells[2][25].setState(true);
        cells[6][25].setState(true);
        cells[7][25].setState(true);
        cells[3][35].setState(true);
        cells[4][35].setState(true);
        cells[3][36].setState(true);
        cells[4][36].setState(true);
    }
}
