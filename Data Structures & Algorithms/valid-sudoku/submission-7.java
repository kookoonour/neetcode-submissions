class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s = new HashSet<>();
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char curr = board[i][j];

                if(!(curr =='.')){
                    if(!s.add(curr + "is at row" + i) || 
                        !s.add(curr+ "is at column" + j) || 
                        !s.add(curr + "is at box" + i/3 + "-" + j/3)){
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
