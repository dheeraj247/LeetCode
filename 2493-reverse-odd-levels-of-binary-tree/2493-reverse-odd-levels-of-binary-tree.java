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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int l=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<TreeNode> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                level.add(curr);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
            if(l%2==1){
                int left=0,right=level.size()-1;
                while(left<right){
                    int temp=level.get(left).val;
                    level.get(left).val=level.get(right).val;
                    level.get(right).val=temp;
                    left++;
                    right--;
                }
            }
            l++;
        }
        return root;
    }
}