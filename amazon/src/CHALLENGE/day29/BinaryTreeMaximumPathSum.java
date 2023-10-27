package CHALLENGE.day29;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Result {
    int maxPathSum;

    Result(int maxPathSum) {
        this.maxPathSum = maxPathSum;
    }
}

class Solution {
    public int maxPathSum(TreeNode root) {
        Result result = new Result(Integer.MIN_VALUE); // Initialize with minimum integer value
        maxPathSumHelper(root, result);
        return result.maxPathSum;
    }

    private int maxPathSumHelper(TreeNode node, Result result) {
        if (node == null) {
            return 0;
        }

        int leftSum = Math.max(0, maxPathSumHelper(node.left, result));
        int rightSum = Math.max(0, maxPathSumHelper(node.right, result));

        int currentPathSum = node.val + leftSum + rightSum;
        result.maxPathSum = Math.max(result.maxPathSum, currentPathSum);

        return node.val + Math.max(leftSum, rightSum);
    }
}

public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        // Construct a binary tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(-25);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(4);

        Solution solution = new Solution();
        int result = solution.maxPathSum(root);
        System.out.println("Maximum path sum: " + result);
    }
}

