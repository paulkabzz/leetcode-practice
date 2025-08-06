class Solution {

    private boolean checkRows(char[][] A) {
        Set<Character> s = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == '.') continue;
                if (s.contains(A[i][j])) return false;
                else s.add(A[i][j]);
            }
            s.clear();
        }
        return true;
    }


    private  boolean checkCols(char[][] A) {
        Set<Character> s = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[j][i] == '.') continue;

                if (s.contains(A[j][i])) return false;
                else s.add(A[j][i]);
            }
            s.clear();
        }
        return true;
    }

    private boolean checkBoxes(char[][] A) {
        Set<Character>[] indices = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            indices[i] = new HashSet<>();
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                int index = (i/3) * 3 + j/3;
                if (A[i][j] == '.') continue;
                if (indices[index].contains(A[i][j])) return false;
                indices[index].add(A[i][j]);
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        return checkRows(board) && checkCols(board) && checkBoxes(board);
    }
}