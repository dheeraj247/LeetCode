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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int maxs=Integer.MIN_VALUE,maxl=1,l=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            int s=0;
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                s+=curr.val;
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            if(s>maxs){
                maxs=s;
                maxl=l;
            }
            l++;
        }
        return maxl;
    }
}