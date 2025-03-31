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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        int l=0;
        if(root==null){
            return res;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                level.add(curr.val);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            if(l%2==1){
                Collections.reverse(level);
            }
            l++;
            res.add(level);
        }
        return res;
    }
}