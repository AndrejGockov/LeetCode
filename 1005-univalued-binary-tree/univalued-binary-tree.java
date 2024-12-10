class Solution {
        public boolean isUnivalTree(TreeNode root){
        if(root == null)
            return true;
        
        return traverseTree(root, root.val);
    }

    public boolean traverseTree(TreeNode root, int val){
        if(root == null)
            return true;
        
        if(root.val != val)
            return false;
        
        return traverseTree(root.left, val) && traverseTree(root.right, val);
    }
}