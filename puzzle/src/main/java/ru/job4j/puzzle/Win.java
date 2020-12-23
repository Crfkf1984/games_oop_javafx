package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (1 == board[i][i]) {
                if ((monoHorizontal(board, i) || monoVertical(board, i))) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (1 != board[row][i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (1 != board[i][column]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static int[] extractDiagonal(int[][] board) {
        int[] rsl = new int[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
}

//        public static boolean isWin(char[][] board) {
//            boolean result = false;
//            for (int i = 0; i < board.length; i++) {
//                if ('X' == board[i][i]) {
//                    if ((monoHorizontal(board, i) || monoVertical(board, i))) {
//                        result = true;
//                        break;
//                    }
//                }
//            }
//}
