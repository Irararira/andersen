package com.andersenlab.lesson2;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final int MAP_SIZE = 5;
    private static final int DOTS_TO_WIN = 4;
    private static final char EMPTY = '-';
    private static final char X = 'X';
    private static final char O = 'O';
    private static char[][] map;

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random(1L);

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            printMap();
            if (checkWin(O)) {
                System.out.println("Победил Компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    private static boolean checkWin(char symb) {
        for (int i = 0; i < MAP_SIZE; i++) {
            boolean[] isWin = new boolean[MAP_SIZE];
            for (int j = 0; j < MAP_SIZE; j++) {
                isWin[j] = map[j][i] == symb;
            }
            if (containsWinTrue(isWin)) {
                return true;
            }
        }

        for (int i = 0; i < MAP_SIZE; i++) {
            boolean[] isWin = new boolean[MAP_SIZE];
            for (int j = 0; j < MAP_SIZE; j++) {
                isWin[j] = map[i][j] == symb;
            }
            if (containsWinTrue(isWin)) {
                return true;
            }
        }

        boolean[] isWinDiagonal = new boolean[MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            isWinDiagonal[i] = map[i][i] == symb;
        }
        if (containsWinTrue(isWinDiagonal)) {
            return true;
        }

        boolean[] isWinOppositeDiagonal = new boolean[MAP_SIZE];
        for (int i = 0, j = MAP_SIZE - 1; i < MAP_SIZE; i++, j--) {
            isWinOppositeDiagonal[i] = map[i][j] == symb;
        }

        return containsWinTrue(isWinOppositeDiagonal);
    }

    private static boolean containsWinTrue(boolean[] array) {
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (!array[i]) return false;
        }
        return true;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (map[i][j] == EMPTY) return false;
            }
        }
        return true;
    }

    private static void computerTurn() {
        int x, y;
        do {
            x = random.nextInt(MAP_SIZE);
            y = random.nextInt(MAP_SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) +
                " " + (y + 1));
        map[y][x] = O;
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = X;
    }

    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= MAP_SIZE || y < 0 || y >= MAP_SIZE) return false;
        return map[y][x] == EMPTY;
    }

    private static void initMap() {
        map = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= MAP_SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < MAP_SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
