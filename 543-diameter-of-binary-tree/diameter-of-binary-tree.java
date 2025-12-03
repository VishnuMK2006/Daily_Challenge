/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int dia=0;
    int height(TreeNode root){
        if(root==null) return 0;
        int lt=height(root.left);
        int rt=height(root.right);
        if(dia<lt+rt) dia=lt+rt;
        return 1+Math.max(lt,rt);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);  
        return dia;
    }
}