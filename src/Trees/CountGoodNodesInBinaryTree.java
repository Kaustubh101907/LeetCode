package Trees;

// Que Link: https://leetcode.com/problems/count-good-nodes-in-binary-tree/

import java.util.ArrayList;
import java.util.List;

public class CountGoodNodesInBinaryTree {
    public static void main(String[] args) {

    }

    public  int goodNodes(TreeNode root) {
        ArrayList<Integer> al = preorderTraversal(root);
        int count = 1;
        int prev = 0;
        for (int i = 1 ; i < al.size(); i++) {
            int x = al.get(i);
            if (x >= prev) {
                prev = x;
                count++;
            }
        }
        return count;
    }

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> nums = preorder(root, new ArrayList<>());
        return nums;
    }

    public ArrayList<Integer> preorder(TreeNode root, ArrayList<Integer> nums) {
        if (root == null) {
            return nums;
        }
        nums.add(root.val);
        preorder(root.left, nums);
        preorder(root.right, nums);
        return nums;
    }
}
