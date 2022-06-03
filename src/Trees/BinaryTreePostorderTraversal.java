package Trees;

// Que Link: https://leetcode.com/problems/binary-tree-postorder-traversal/

import java.util.*;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al = postOrder(root, new ArrayList<>());
        return al;
    }

    public ArrayList<Integer> postOrder(TreeNode root, ArrayList<Integer> al) {
        if (root == null) {
            return al;
        }
        postOrder(root.left, al);
        postOrder(root.right, al);
        al.add(root.val);
        return al;
    }
}
