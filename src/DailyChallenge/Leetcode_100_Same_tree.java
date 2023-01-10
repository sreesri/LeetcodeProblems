package DailyChallenge;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +val +
                "," + left +
                "," + right +
                '}';
    }
}
class SameTree {

    public static boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p != null && q == null || p==null && q!= null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
    public static void main(String[] args) {
        TreeNode p = new TreeNode( 1,new TreeNode(2,new TreeNode(4,null,null),null),new TreeNode(3,null,null));
        TreeNode q = new TreeNode( 1,new TreeNode(2,null,null),new TreeNode(3,null,null));
        System.out.println(isSame(p,q));
    }
}


