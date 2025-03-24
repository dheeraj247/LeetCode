/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        dfs(root,list,new ArrayList<>(),targetSum);
        return list;
    }
    void dfs(TreeNode root,List<List<Integer>> list,List<Integer> tl,int targetSum){
        if(root==null){
            return;
        }
        tl.add(root.val);
        if(root.left==null && root.right==null){
            int s=0;
            for(int i=0;i<tl.size();i++){
                s+=tl.get(i);
            }
            if(s==targetSum){
                list.add(new ArrayList<>(tl));
            }
        }
        dfs(root.left,list,tl,targetSum);
        dfs(root.right,list,tl,targetSum);
        tl.remove(tl.size()-1);
    }
}