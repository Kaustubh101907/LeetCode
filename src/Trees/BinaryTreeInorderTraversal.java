package Trees;

// Que Link: https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.*;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> nums = inOrder(root, new ArrayList<>());
        return nums;
    }

    public ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return arr;
        }
        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
        return arr;
    }
}
