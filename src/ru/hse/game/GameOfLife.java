package ru.hse.game;

import ru.hse.game.boards.*;

import java.io.IOException;

public class GameOfLife {

    private static Board board;
    private static BoardFactory boardFactory;

    private final static int SLEEP_MILLIS = 200;
    private final static int STEP_COUNT = 1000;

    public static void play(int height, int width) {
        boardFactory = new BoardFactory();
        board = boardFactory.createBoard(height, width);

        board.fillBoard();

        for (int i = 0; i < STEP_COUNT; i++) {
            clearScreen();
            printField();
            calculateNextState();
            goToNextState();
            sleep();
        }

    }

    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void printField() {
        for (int i = 0; i < board.height; i++) {
            for (int j = 0; j < board.width; j++) {
                System.out.print(board.cells[i][j].print());
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void calculateNextState() {
        for (int i = 0; i < board.height; i++) {
            for (int j = 0; j < board.width; j++) {
                int neighborsCount = getAliveNeighbors(i, j);
                if (board.cells[i][j].isState()) {
                    if (neighborsCount < 2 || neighborsCount > 3) {
                        board.cells[i][j].setNextState(false);
                    } else {
                        board.cells[i][j].setNextState(true);
                    }
                } else {
                    if (neighborsCount == 3) {
                        board.cells[i][j].setNextState(true);
                    }
                }
            }
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(SLEEP_MILLIS);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private static void goToNextState() {
        for (int i = 0; i < board.height; i++) {
            for (int j = 0; j < board.width; j++) {
                board.cells[i][j].setState(board.cells[i][j].isNextState());
            }
        }
    }

    private static int getAliveNeighbors(int i, int j) {
        int count = 0;
        for (int ii = i - 1; ii <= i + 1; ii++) {
            for (int jj = j - 1; jj <= j + 1; jj++) {
                if (ii < 0 || ii >= board.height) {
                    continue;
                }

                if (jj < 0 || jj >= board.width) {
                    continue;
                }

                if (ii == i && jj == j) {
                    continue;
                }

                if (board.cells[ii][jj].isState()) {
                    count++;
                }
            }
        }
        return count;
    }

}
