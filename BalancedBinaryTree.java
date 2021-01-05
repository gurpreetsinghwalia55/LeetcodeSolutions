class Solution {
    
    public boolean result = true;
    
    public int traverse(TreeNode root, int height){
        if(root == null) return 0;
        
        int left = traverse(root.left, height);
        int right = traverse(root.right, height);
        height = Math.max(left, right);
        boolean currResult = (Math.abs(left - right)) <= 1;
        result = result && currResult;
        return height + 1;
    }
    
    public boolean isBalanced(TreeNode root) {
        traverse(root, 0);
        return result;
    }
}
