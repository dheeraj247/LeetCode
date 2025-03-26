class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr.add(grid[i][j]);
            }
        }
        Collections.sort(arr);
        int n=arr.size(),mid=arr.get(n/2),res=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)%x!=mid%x){
                return -1;
            }
            res+=Math.abs(arr.get(i)-mid)/x;
        }
        return res;
    }
}