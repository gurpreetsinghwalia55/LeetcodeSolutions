class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        //create a q and push root node
        Node dummyNode = new Node(-1);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(dummyNode);
        //traverse the q if the q is not empty
        while(!q.isEmpty()){
            //pop the node from the q
            Node node = q.poll();
            System.out.println("processing element " + node.val);
            //check if q is empty
            if(q.isEmpty() || q.peek() == dummyNode){
                //assign node.next null value
                node.next = null;
            }else{
                //if q is not empty, peek the q
                //assign node.next the value of the peeked node  
                System.out.println("value of peek is "+ q.peek().val);
                node.next = q.peek();
            }
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
            if(q.peek() == dummyNode){
                q.remove();
                q.add(dummyNode);
            }
            
        }
        return root;
    }
}
