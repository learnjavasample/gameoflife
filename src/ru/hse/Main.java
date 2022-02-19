package ru.hse;

import ru.hse.game.GameOfLife;

public class Main {

    public static void main(String[] args) {
        GameOfLife.play(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    }
}
