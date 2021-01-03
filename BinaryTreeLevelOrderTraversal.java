class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode temp = new TreeNode(Integer.MIN_VALUE);
        q.add(temp);
        List<Integer> list = new ArrayList<Integer>();
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            list.add(node.val);
            if(node.left != null){
                q.add(node.left);    
            }
            if(node.right != null){
                q.add(node.right);    
            }
            if(q.peek() != null && q.peek().val == Integer.MIN_VALUE){
                q.remove();
                result.add(list);
                list = new ArrayList<Integer>();
                q.add(temp);
            } 
        }
        return result;
    }
}
