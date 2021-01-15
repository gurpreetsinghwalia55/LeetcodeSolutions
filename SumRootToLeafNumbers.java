class Solution {
    public void util(TreeNode root, int result){
        if(root.left == null && root.right == null){
            result = (result * 10) + root.val;
            globalResult += result;
            System.out.println("result = "+result+" globalResult = "+globalResult);
            return;
        }
        result = (result*10) + root.val;
        System.out.println("result = "+result+ "globalResult = "+globalResult);
        if(root.left != null) util(root.left, result);
        if(root.right != null) util(root.right, result);
    }
    public int globalResult = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        int result = 0;    
        util(root, result);
        return globalResult;
    }
}
