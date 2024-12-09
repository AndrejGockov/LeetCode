/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer>list = new ArrayList<Integer>();
        
        if(root != null)
            itterator(root, list);

        return list;
    }

    private void itterator(Node root, List<Integer> list) {
        for (Node child : root.children) {
            if (child != null) {
                itterator(child, list);
            }
        }
        list.add(root.val);
    }
}