package ru.hse.game.boards;

import java.util.Scanner;

public class BoardFactory {

    private static final Scanner scanner = new Scanner(System.in);

    public Board createBoard(int h, int w) {
        System.out.println("Input number from 1 to 3");
        int i;
        do {
            i = scanner.nextInt();
        } while (i < 1 || i > 3);

        return switch (i) {
            case 1 -> new RandomBoard(h, w);
            case 2 -> new GliderBoard(h, w);
            case 3 -> new GliderGunBoard(h, w);
            default -> null;
        };
    }
}
