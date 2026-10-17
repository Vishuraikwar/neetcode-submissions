class Solution {
    public boolean isValidSudoku(char[][] board) {
        // row check
        for(int row = 0 ; row < 9 ; row++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0 ; i < 9 ; i++){
                if(board[row][i]=='.') continue;
                if(seen.contains(board[row][i])) return false;
                seen.add(board[row][i]);
            }
        }
        // col check
        for(int col = 0 ; col < 9 ; col++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0 ; i < 9 ; i++){
                if(board[i][col]=='.') continue;
                if(seen.contains(board[i][col])) return false;
                seen.add(board[i][col]);
            }
        }
        // grid check
        for(int gridRow = 0 ; gridRow < 9 ; gridRow += 3){
            for(int gridCol = 0 ; gridCol < 9 ; gridCol += 3){
                HashSet<Character> seen = new HashSet<>();
                for(int  row = gridRow ; row < gridRow+3 ; row++){
                    for(int  col = gridCol ; col < gridCol+3 ; col++){
                        if(board[row][col]=='.') continue;
                        if(seen.contains(board[row][col])) return false;
                        seen.add(board[row][col]);
                }
                }
            }
        }
        return true;
    }
}
