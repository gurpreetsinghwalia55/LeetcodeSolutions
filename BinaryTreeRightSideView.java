class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)return new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode temp = new TreeNode(Integer.MIN_VALUE);
        q.add(root);
        q.add(temp);
        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
            if(q.peek() != null && q.peek().val == Integer.MIN_VALUE){
                result.add(node.val);
                q.remove();
                q.add(temp);
            }
        }
        return result;
    }
}
