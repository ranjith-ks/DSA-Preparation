/*
One way to serialize a binary tree is to use preorder traversal. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as '#'.
For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where '#' represents a null node.
Given a string of comma-separated values preorder, return true if it is a correct preorder traversal serialization of a binary tree.
It is guaranteed that each comma-separated value in the string must be either an integer or a character '#' representing null pointer.
You may assume that the input format is always valid.
For example, it could never contain two consecutive commas, such as "1,,3".
Note: You are not allowed to reconstruct the tree.
*/

class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] pre = preorder.split(",");
        int stk = 0,i=0,n=pre.length;
        for(;i<n;i++) {
            if("#".equals(pre[i])) {
                if(stk==0)
                    break;
                stk--;
            }
            else
                stk++;
        }
        return stk==0 && i==n-1;
    }
}