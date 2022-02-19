package ru.hse.game.boards;

import ru.hse.game.Cell;

public abstract class Board {

    public int height;
    public int width;

    public Cell[][] cells;

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        cells = new Cell[height][width];
    }

    public abstract void fillBoard();

    protected void fillBoardEmpty() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                cells[i][j] = new Cell();
            }
        }
    }
}
