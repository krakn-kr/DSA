package CHALLENGE.day30;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class ValidPathInBinaryTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(1);
        root.right=new TreeNode(0);
        root.left.left=new TreeNode(0);
        root.right.left=new TreeNode(0);
        root.left.left.right = new TreeNode(1);
        root.right.left.left = new TreeNode(1);
        int[] sequence = {0, 0,0,1};
        ValidPathInBinaryTree validator=new ValidPathInBinaryTree();
        boolean isValid=validator.isValidSequence(root,sequence);
        if (isValid) {
            System.out.println("The sequence is valid.");
        } else {
            System.out.println("The sequence is not valid.");
        }
    }

    public boolean isValidSequence(TreeNode root, int[] arr) {
        return isValidPath(root,arr,0);
    }

    private boolean isValidPath(TreeNode node, int[] arr, int index) {
        if(node==null || index >= arr.length){
            return false;
        }
        if(node.val != arr[index]){
            return false;
        }
        if(node.left==null && node.right==null ){
            return index == arr.length-1;
        }

        boolean leftValid=isValidPath(node.left,arr,index+1);
        boolean rightValid=isValidPath(node.right,arr,index+1);
        return leftValid || rightValid;
    }
}
