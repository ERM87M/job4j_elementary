package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int colum) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][colum] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}

