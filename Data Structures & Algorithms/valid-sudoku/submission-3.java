class Solution {
    public boolean isValidSudoku(char[][] board) {
       // row 
        for(int i = 0 ; i < 9 ; i++){
            HashSet<Character> row = new HashSet<>();
            for(int j = 0 ; j < 9 ; j++){
                char curr = board[i][j];
                if(curr == '.') continue;
                if(row.contains(curr)) return false;
                row.add(curr);
            }
        }
        // col 
        for(int i = 0 ; i < 9 ; i++){
            HashSet<Character> col = new HashSet<>();
            for(int j = 0 ; j < 9 ; j++){
                char curr = board[j][i];
                if(curr == '.') continue;
                if(col.contains(curr)) return false;
                col.add(curr);
            }
        }
        // grid 
        for(int gridRow = 0 ; gridRow < 9 ; gridRow += 3){
            for(int gridCol = 0 ; gridCol < 9 ; gridCol += 3){
                HashSet<Character> grid = new HashSet<>();
                for(int row = gridRow ; row < gridRow+3 ; row++){
                    for(int col = gridCol ; col < gridCol+3 ; col++){
                        char curr = board[row][col];
                        if(curr == '.') continue;
                        if(grid.contains(curr)) return false;
                        grid.add(curr);
                    }
                }
            }
        }
        return true;

    }
}
