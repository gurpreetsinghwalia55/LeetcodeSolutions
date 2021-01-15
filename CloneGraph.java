
class Solution {
    Map<Node, Node> visited = new HashMap();
    public Node copy(Node node){
        if(node == null || visited.containsKey(node))
            return visited.get(node);
        
        Node temp = new Node(node.val);
        visited.put(node, temp);
        
        ArrayList<Node> list = new ArrayList<Node>();
        for(Node n : node.neighbors){
            list.add(copy(n));
        }
        temp.neighbors = list;
        return temp;
    }
    
    public Node cloneGraph(Node node) {
       return copy(node);
    }
}
