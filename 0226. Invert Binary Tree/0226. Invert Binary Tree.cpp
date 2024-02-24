class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        if(root == NULL) return NULL;
        //if the given node is null return null

        //invert the left subtree
        invertTree(root->left);
        //invert the right subtree
        invertTree(root->right);

        //invert the current node
        TreeNode* temp= root->left;
        root->left=root->right;
        root->right=temp;

        //return the root
        return root;
    }
};