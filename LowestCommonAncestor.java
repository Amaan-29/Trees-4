public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //using recursion
//        if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
//        else if(p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
//        else return root;

        //without recursion
        while(true){
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
    }
}

//TC : O(log N)
//SC : O(1)