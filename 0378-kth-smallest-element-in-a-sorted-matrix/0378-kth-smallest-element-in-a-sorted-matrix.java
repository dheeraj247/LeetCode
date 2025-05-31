class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int row[]: matrix){
            for(int i: row){
                arr.add(i);
            }
        }
        Collections.sort(arr);
        return arr.get(k-1);
    }
}