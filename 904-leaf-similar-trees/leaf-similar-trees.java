class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>leafs1 = new ArrayList<>();
        List<Integer>leafs2 = new ArrayList<>();
        
        leaves(root1, leafs1);
        leaves(root2, leafs2);

        return leafs1.equals(leafs2);
    }

    private void leaves(TreeNode root, List<Integer> leafs){
        if(root.left == null && root.right == null)
            leafs.add((int)root.val);
        
        if(root.left != null)
            leaves(root.left, leafs);
        
        if(root.right != null)
            leaves(root.right, leafs);
    }
}
