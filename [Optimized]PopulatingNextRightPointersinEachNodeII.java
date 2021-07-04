class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        util(root);
        return root;
        
    }
    
    //previous node's next ptr is already connected. So you can use that to get to the right path to find the child node's next ptr.
    
    public void util(Node root){
        if(root == null) return;
        if(root.left != null) root.left.next = (root.right != null)? root.right: findNextNode(root.next);
        if(root.right != null) root.right.next = findNextNode(root.next);
        if(root.right != null) util(root.right);
        if(root.left != null) util(root.left);
    }
    
    public Node findNextNode(Node root){
        if(root == null) return root;
        if(root.left != null) return root.left;
        if(root.right != null) return root.right;
        return findNextNode(root.next);
    }
}
