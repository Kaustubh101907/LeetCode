package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null) {
            return al;
        }
        TreeNode curr = root;
        while(curr != null) {
            al.add(root.val);
            curr = curr.right;
        }
        return al;
    }
}
