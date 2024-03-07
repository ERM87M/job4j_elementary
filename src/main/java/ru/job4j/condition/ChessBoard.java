package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (isInvalid(x1) && isInvalid(x2) && isInvalid(y1) && isInvalid(y2)) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                result = Math.abs(x1 - x2);
            }
        }
        return result;
    }

    private static boolean isInvalid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(2, 1, 6, 5));
    }
}
