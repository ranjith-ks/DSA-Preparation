/*
Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
*/

/*
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }
    private void preorder(Node root,List<Integer> res) {
        if(root==null)
            return;
        res.add(root.val);
        Queue<Node> q = new LinkedList<>();
        for(Node c:root.children)
            q.offer(c);
        while(!q.isEmpty())
            preorder(q.poll(),res);
    }
}
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        while(!stk.empty()) {
            Node n = stk.pop();
            res.add(n.val);
            for(int i=n.children.size()-1;i>-1;i--)
                stk.push(n.children.get(i));
        }
        return res;
    }
}