class Solution {
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int c=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    c++;
                    dfs(grid,i,j);
                }
            }
        }
        return c;   
    }
    public void dfs(char[][] grid,int i,int j){
        int rows=grid.length;
        int cols=grid[0].length;
        if(i<0 || j<0 || i>=rows || j>=cols || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}