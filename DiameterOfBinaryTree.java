class Solution {
    int result;
    public int getDepth(TreeNode root){
        if(root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        
        result = Math.max(result, 1+left+right);
        
        return Math.max(left, right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        result = 1;
        getDepth(root);
        return result - 1;
    }
}
