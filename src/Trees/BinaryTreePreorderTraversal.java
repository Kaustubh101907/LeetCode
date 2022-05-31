package Trees;

import java.util.*;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
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
