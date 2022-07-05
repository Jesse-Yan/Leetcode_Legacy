public class I0406 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode current, turnLeft = null;
        if (p.right != null) {
            if (p.right.left != null) {
                current = p.right.left;
                while (current.left != null)
                    current = current.left;
                return current;
            } else {
                return p.right;
            }
        }
        current = root;
        while (current != p) {
            if(current.val < p.val) {
                current = current.right;
            } else {
                turnLeft = current;
                current = current.left;
            }
        }
        return turnLeft;
    }
}
