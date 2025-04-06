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
    public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return false;
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
            arr.add(level);
        }
        for(int i=0;i<arr.size();i++){
            List<Integer> row=arr.get(i);
            if(i%2==0){
                for(int j=0;j<row.size();j++){
                    if(row.get(j)%2==0){
                        return false;
                    }
                    if(j>0 && row.get(j)<=row.get(j-1)){
                        return false;
                    }
                }
            }
            else{
                for(int j=0;j<row.size();j++){
                    if(row.get(j)%2!=0){
                        return false;
                    }
                    if(j>0 && row.get(j)>=row.get(j-1)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}