class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        List<List<Character>> sudoku = new ArrayList<List<Character>>();
        for(int i = 0 ; i<board.length ; i++)
        {
            List<Character> eachRow = new ArrayList<Character>();
            for( int j = 0 ; j< board[0].length ; j++)
            {
                if(board[i][j]!='.')
                {
                    if(eachRow.indexOf(board[i][j]) == -1) // checks row
                    {
                        // checks column
                        for(int x = 0 ; x < i ; x++)
                        {
                            if(sudoku.get(x).get(j)==board[i][j]){
                                return false;
                            }

                        }
                        // checks 3x3
                        for(int x = i%3 ; x>0 ; x--)
                        {
                            for(int y = 0 ; y<3 ; y++)
                            {
                                if(sudoku.get(i-x).get(((j/3)*3)+y)==board[i][j]){
                                    return false;
                                }
                            }
                        }
                        eachRow.add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }
                else{
                    eachRow.add(board[i][j]);
                }
            }
            sudoku.add(eachRow);
        }
        return true;
    }
}