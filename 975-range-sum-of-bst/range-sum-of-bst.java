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
    static int Low;
    static int High;
    int ans;
    public int rangeSumBST(TreeNode root, int low, int high) {
        ans = 0;
        Low = low;
        High = high;
        sumNodes(root);
        return ans;
    }

    public void sumNodes(TreeNode root){
        if(root == null)
            return;
        
        if(root.val >= Low && root.val <= High)
            ans += root.val;
        
        sumNodes(root.left);
        sumNodes(root.right);
    }
}