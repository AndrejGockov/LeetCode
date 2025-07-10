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
    public boolean isValidBST(TreeNode root) {
        return goThroughTree(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean goThroughTree(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }

        System.out.println(root.val);
        
        if(min >= root.val){
            return false;
        }

        if(max <= root.val){
            return false;
        }

        return goThroughTree(root.left, min, root.val) && goThroughTree(root.right, root.val, max);
    }
}