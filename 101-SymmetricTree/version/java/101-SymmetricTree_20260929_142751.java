// Last updated: 29/09/2026, 14:27:51
1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        return check(root.left, root.right);
4    }
5    public boolean check(TreeNode a, TreeNode b) {
6        if (a == null && b == null)
7            return true;
8        if (a == null || b == null)
9            return false;
10        if (a.val != b.val)
11            return false;
12        return check(a.left, b.right) &&
13               check(a.right, b.left);
14    }
15}