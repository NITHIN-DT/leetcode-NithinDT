// Last updated: 16/09/2026, 09:13:56
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int max=Integer.MIN_VALUE;
18    public int maxPathSum(TreeNode root) {
19        solve(root);
20        return max;
21    }
22    public int solve(TreeNode root) {
23        if (root == null) return 0;
24        int left = Math.max(0, solve(root.left));
25        int right = Math.max(0, solve(root.right));
26        int curr = root.val + left + right;
27        max = Math.max(max, curr);
28        return root.val + Math.max(left, right);
29    }
30}