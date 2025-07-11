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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode res = new TreeNode(val);
            res.left = root;
            return res;
        }
        treeTraverse(root, val, depth, 1);
        return root;
    }

    public void treeTraverse(TreeNode root, int val, int depth, int currDepth){
        if(currDepth == depth - 1){
            if(root.left != null){
                TreeNode newLeft = new TreeNode(val);
                TreeNode tmp = root.left;
                newLeft.left = tmp;
                root.left = newLeft;
            }else{
                root.left = new TreeNode(val);
            }

            if(root.right != null){
                TreeNode newRight = new TreeNode(val);
                TreeNode tmp = root.right;
                newRight.right = tmp;
                root.right = newRight;
            }else{
                root.right = new TreeNode(val);
            }
        }
        
        currDepth++;
        
        if(root.left != null){
            treeTraverse(root.left, val, depth, currDepth);
        }

        if(root.right != null){
            treeTraverse(root.right, val, depth, currDepth);
        }
    }
}