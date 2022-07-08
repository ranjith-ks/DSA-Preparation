/*
Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
*/

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