class Solution {
    public static int result = 0;
    public void getDepth(TreeNode root, int depth){
        if(root.left == null && root.right == null){
            result = Math.max(result, depth);
            return;
        }
        
        if(root.left != null) getDepth(root.left, depth+1);
        if(root.right != null) getDepth(root.right, depth+1);
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        getDepth(root, 1);
        return result;
    }
}
