package ru.hse.game.boards;

import ru.hse.game.Cell;

public class RandomBoard extends Board {

    public RandomBoard(int height, int width) {
        super(height, width);
    }

    @Override
    public void fillBoard() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int r = (int) (Math.random() * 3);
                if (r == 0) {
                    cells[i][j] = new Cell(true);
                } else {
                    cells[i][j] = new Cell(false);
                }
            }
        }
    }
}
